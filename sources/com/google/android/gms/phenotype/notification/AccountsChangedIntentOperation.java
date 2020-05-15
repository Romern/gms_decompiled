package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import com.google.android.chimera.IntentOperation;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private Context f82122a;

    /* renamed from: b */
    private anfg f82123b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public final void onCreate() {
        anfg a = anfg.m64152a(this);
        this.f82122a = this;
        this.f82123b = a;
    }

    public final void onDestroy() {
        this.f82123b.close();
    }

    public final void onHandleIntent(Intent intent) {
        try {
            Set a = anfv.m64174a(this.f82123b.getWritableDatabase());
            String[] a2 = angd.m64197a(this.f82122a);
            int length = a2.length;
            int i = 0;
            while (i < length) {
                if (a.contains(a2[i])) {
                    i++;
                } else {
                    anij.m64478a(this, 6, (String) null);
                    return;
                }
            }
        } catch (SQLiteException e) {
        }
    }
}
