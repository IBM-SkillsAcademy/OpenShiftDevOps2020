FROM registry.access.redhat.com/ubi8
WORKDIR /app
COPY Pipfile* /app/
USER root
RUN yum -y install python3
RUN yum -y install python3-pip wget
RUN pip3 install --upgrade pip \
  && pip3 install --upgrade pipenv \
  && pipenv install --system --deploy
RUN mkdir -p /app/server/audio_extractions
RUN mkdir -p /app/server/video_uploads
RUN mkdir -p /app/server/output_transcriptions
RUN mkdir -p /app/server/output_transcripts
COPY . /app
ENV FLASK_APP=server/__init__.py
CMD ["python3", "manage.py", "start", "0.0.0.0:3000"]
RUN useradd -u 1001 -g 0 ibm
RUN chown -R ibm /app && chmod -R 770 /app && chmod -R g+s /app
USER ibm