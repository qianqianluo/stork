/*
 * Tigase Halcyon XMPP Library
 * Copyright (C) 2018 Tigase, Inc. (office@tigase.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 */

package org.tigase.messenger.phone.pro.utils;

import android.accounts.Account;
import android.accounts.AccountManager;

public class AccountHelper {

	public static Account getAccount(AccountManager mAccountManager, String name) {
		for (Account account : mAccountManager.getAccounts()) {
			if (account.name.equals(name)) {
				return account;
			}
		}
		return null;
	}

	private AccountHelper() {
	}

}
