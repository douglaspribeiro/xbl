/*
 * Copyright (c) 2009. The Frontside Software, Inc.
 *
 * The contents of this file are subject to the Gnu General Public License version 2
 * or later (the "License"); You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 */

package xbl;

import java.util.Date;


public class MessageHeader {

	private int messageId;
	private boolean read;
	private String gamerTileURL;
	private String from;
	private String summary;
	private String dateString;
	private String timeString;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getGamerTileURL() {
		return gamerTileURL;
	}

	public void setGamerTileURL(String gamerTileURL) {
		this.gamerTileURL = gamerTileURL;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public String getTimeString() {
		return timeString;
	}

	public void setTimeString(String timeString) {
		this.timeString = timeString;
	}

	public String toString() {
		return String.format("MessageHeader(id: %s, from: %s, time: %s %s, read: %s, tile: %s, summary: %s)", messageId, from, dateString, timeString, read, gamerTileURL, summary);
	}


}
