package p000;

import android.content.ContentValues;

/* renamed from: agpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class agpy {
    /* renamed from: a */
    public static agpy m54823a(ContentValues contentValues) {
        return new agpq(contentValues);
    }

    /* renamed from: a */
    public abstract ContentValues mo35879a();

    /* renamed from: b */
    public final Long mo35923b() {
        return mo35879a().getAsLong("carrier_id");
    }

    /* renamed from: c */
    public final String mo35924c() {
        return mo35879a().getAsString("cpid");
    }

    /* renamed from: d */
    public final Long mo35925d() {
        return mo35879a().getAsLong("expiration_time");
    }
}
