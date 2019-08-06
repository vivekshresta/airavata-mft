/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.airavata.mft.core.streaming;

import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class TransportStream {

    private OutputStream outputStream = new DoubleByteArrayOutputStream();
    private InputStream inputStream = new DoubleByteArrayInputStream((DoubleByteArrayOutputStream) outputStream);
    private long length = -1;
    private AtomicBoolean streamCompleted = new AtomicBoolean(false);

    public TransportStream() throws IOException {
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public AtomicBoolean getStreamCompleted() {
        return streamCompleted;
    }

    public void setStreamCompleted(AtomicBoolean streamCompleted) {
        this.streamCompleted = streamCompleted;
    }
}