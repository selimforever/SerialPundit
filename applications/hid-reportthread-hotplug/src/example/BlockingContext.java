/*
 * This file is part of SerialPundit project and software.
 * 
 * Copyright (C) 2014-2016, Rishi Gupta. All rights reserved.
 *
 * The SerialPundit software is DUAL licensed. It is made available under the terms of the GNU Affero 
 * General Public License (AGPL) v3.0 for non-commercial use and under the terms of a commercial 
 * license for commercial use of this software. 
 * 
 * The SerialPundit software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

package example;

public final class BlockingContext {

	private long blockingContext;

	public BlockingContext(long blockingContext) {
		this.blockingContext = blockingContext;
	}

	public long getBlockingContext() {
		return blockingContext;
	}

	public void setBlockingContext(long blockingContext) {
		this.blockingContext = blockingContext;
	}
}
