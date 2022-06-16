## Kafka Tweet Producer

This is a python program to send tweets to a Kafka topic.

**Step 1** - Build the docker image

``` bash
docker build --tag kafka-tweet-producer .
```

**Step 2** - Run container using the following command.
``` bash
docker run --network="host" \
    -e TWITTER_API_KEY="" \
    -e TWITTER_API_SECRET="" \
    -e TWITTER_ACCESS_TOKEN="" \
    -e TWITTER_ACCESS_TOKEN_SECRET="" \
    kafka-tweet-producer
```

Get the Twitter credentials from https://developer.twitter.com.