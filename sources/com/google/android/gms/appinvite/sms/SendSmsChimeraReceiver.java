package com.google.android.gms.appinvite.sms;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.telephony.TelephonyManager;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendSmsChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        ReentrantLock reentrantLock;
        Context context2 = context;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("accountName");
        String stringExtra2 = intent2.getStringExtra("inviteId");
        String stringExtra3 = intent2.getStringExtra("opCode");
        fvb a = fvb.m12459a();
        int resultCode = getResultCode();
        if (resultCode != -1) {
            if (resultCode != 1) {
                if (resultCode != 2) {
                    if (resultCode != 3) {
                        if (resultCode != 4) {
                            a.mo11387a(context2, stringExtra2, 3);
                        }
                    }
                }
                a.mo11387a(context2, stringExtra2, 1);
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                telephonyManager.listen(new fvu(telephonyManager, context2, intent2), 1);
            }
            a.mo11387a(context2, stringExtra2, 3);
        } else {
            a.mo11387a(context2, stringExtra2, 2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a.f17328a.lock();
        try {
            Cursor query = fvc.m12461a(context).getReadableDatabase().query("sms", new String[]{"invitation_id", "status"}, "operation_id=?", new String[]{stringExtra3}, null, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("status");
                    int columnIndex2 = query.getColumnIndex("invitation_id");
                    boolean z = true;
                    while (query.moveToNext()) {
                        String string = query.getString(columnIndex2);
                        int i = query.getInt(columnIndex);
                        if (i == 0) {
                            z = false;
                        } else if (i == 2) {
                            arrayList.add(string);
                        } else if (i == 3) {
                            arrayList2.add(string);
                        }
                    }
                    if (!z) {
                        return;
                    }
                } finally {
                    query.close();
                }
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                Intent startIntent = IntentOperation.getStartIntent(context2, UpdateSmsOperation.class, "com.google.android.gms.appinvite.intents.UPDATE_SMS");
                startIntent.putExtra("accountName", stringExtra);
                startIntent.putExtra("sentSms", new ArrayList(arrayList));
                startIntent.putExtra("notSentSms", new ArrayList(arrayList2));
                context2.startService(startIntent);
            }
            a.f17328a.lock();
            try {
                fvc.m12461a(context).getWritableDatabase().delete("sms", "operation_id=? AND status IN (2,3)", new String[]{stringExtra3});
                reentrantLock = a.f17328a;
            } catch (SQLiteException e) {
                reentrantLock = a.f17328a;
            } catch (Throwable th) {
                a.f17328a.unlock();
                throw th;
            }
            reentrantLock.unlock();
        } finally {
            a.f17328a.unlock();
        }
    }
}
