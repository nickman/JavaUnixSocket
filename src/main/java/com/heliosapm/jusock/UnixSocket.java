/**
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
 */
package com.heliosapm.jusock;

import java.io.File;
import java.net.Socket;

/**
 * <p>Title: UnixSocket</p>
 * <p>Description: </p> 
 * @author Whitehead (nwhitehead AT heliosdev DOT org)
 * <p><code>com.heliosapm.jusock.UnixSocket</code></p>
 */

public class UnixSocket extends Socket {
	/** The inner netty unix socket */
	protected final io.netty.channel.unix.Socket usock;
	/** The file name of the unix socket to connect to */
	protected File usockFile = null;
	
	/**
	 * Creates a new disconnected UnixSocket
	 */
	public UnixSocket() {
		usock = io.netty.channel.unix.Socket.newSocketDomain();
	}


}
