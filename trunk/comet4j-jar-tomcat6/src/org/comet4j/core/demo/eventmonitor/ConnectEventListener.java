/**
 * @(#)ConnectEventListener.java 2011-3-9 Copyright 2011 it.kedacom.com, Inc.
 *                               All rights reserved.
 */

package org.comet4j.core.demo.eventmonitor;

import org.comet4j.core.event.ConnectEvent;
import org.comet4j.core.listener.ConnectListener;

/**
 * (用一句话描述类的主要功能)
 * @author xiaojinghai
 * @date 2011-3-9
 */

public class ConnectEventListener extends ConnectListener {

	/*
	 * (non-Jsdoc)
	 * @see org.comet4j.event.Listener#handleEvent(org.comet4j.event.Event)
	 */
	@Override
	public boolean handleEvent(ConnectEvent anEvent) {
		System.out.println("[DroppedEvent]:cId=" + anEvent.getConn().getId());
		return false;
	}

}