package com.google.android.libraries.rocket.impressions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Session implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bebt();

    /* renamed from: a */
    public static final long f111417a = TimeUnit.DAYS.toNanos(14);

    /* renamed from: b */
    public final ArrayList f111418b;

    /* renamed from: c */
    public bebu f111419c;

    /* renamed from: d */
    public final bkxy f111420d;

    /* renamed from: e */
    public final bkxu f111421e;

    /* renamed from: f */
    public long f111422f;

    /* renamed from: g */
    public long f111423g;

    /* renamed from: h */
    public long f111424h;

    /* renamed from: i */
    public long f111425i;

    /* renamed from: j */
    public final bxvd f111426j;

    public Session(Parcel parcel) {
        this.f111418b = new ArrayList();
        try {
            this.f111420d = (bkxy) bxvk.m124016a(bkxy.f125432a, parcel.createByteArray(), bxus.m123744c());
            bxvd da = bkxw.f125425e.mo74144da();
            da.mo73635b(parcel.createByteArray(), bxus.m123744c());
            this.f111426j = da;
            this.f111421e = (bkxu) bxvk.m124016a(bkxu.f125420c, parcel.createByteArray(), bxus.m123744c());
            this.f111422f = parcel.readLong();
            this.f111423g = parcel.readLong();
            this.f111424h = parcel.readLong();
            this.f111425i = parcel.readLong();
            this.f111419c = bebu.m91748a(parcel.readString());
        } catch (bxwf e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m94888a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            Session session = (Session) obj;
            if (!m94888a(this.f111418b, session.f111418b) || !m94888a(this.f111419c, session.f111419c) || !m94888a(this.f111420d, session.f111420d) || !m94888a(this.f111426j.mo74062i(), session.f111426j.mo74062i()) || !m94888a(this.f111421e, session.f111421e) || !m94888a(Long.valueOf(this.f111422f), Long.valueOf(session.f111422f)) || !m94888a(Long.valueOf(this.f111423g), Long.valueOf(session.f111423g)) || !m94888a(Long.valueOf(this.f111424h), Long.valueOf(session.f111424h)) || !m94888a(Long.valueOf(this.f111425i), Long.valueOf(session.f111425i))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f111418b, this.f111419c, this.f111420d, this.f111426j.mo74062i(), this.f111421e, Long.valueOf(this.f111422f), Long.valueOf(this.f111423g), Long.valueOf(this.f111424h), Long.valueOf(this.f111425i)).hashCode();
    }

    public final String toString() {
        return String.format("Session[queue=%s, status=%s, cilentInfo=%s, sessionInfo=%s, systemInfo=%s, currSeqNum=%s, lastHeartbeatSeqNum=%s, lastHeartbeatClientTimeUsec=%s, sessionStartTimeNsec=%s]", this.f111418b, this.f111419c, this.f111420d, this.f111426j.mo74062i(), this.f111421e, Long.valueOf(this.f111422f), Long.valueOf(this.f111424h), Long.valueOf(this.f111424h), Long.valueOf(this.f111425i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f111418b.isEmpty()) {
            parcel.writeByteArray(this.f111420d.mo73642k());
            parcel.writeByteArray(((bkxw) this.f111426j.mo74062i()).mo73642k());
            parcel.writeByteArray(this.f111421e.mo73642k());
            parcel.writeLong(this.f111422f);
            parcel.writeLong(this.f111423g);
            parcel.writeLong(this.f111424h);
            parcel.writeLong(this.f111425i);
            parcel.writeString(this.f111419c.name());
            return;
        }
        throw new IllegalStateException("cannot writeToParcel with impression to be flush");
    }

    /* renamed from: a */
    public final void mo60603a(bebw bebw) {
        bxvd bxvd = this.f111426j;
        String uuid = UUID.randomUUID().toString();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxw bkxw = (bkxw) bxvd.f164949b;
        bkxw bkxw2 = bkxw.f125425e;
        uuid.getClass();
        bkxw.f125427a |= 1;
        bkxw.f125428b = uuid;
        bxvd bxvd2 = this.f111426j;
        long a = bebw.mo58543a();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bkxw bkxw3 = (bkxw) bxvd2.f164949b;
        bkxw3.f125427a |= 2;
        bkxw3.f125429c = a;
        this.f111425i = bebw.m91749b();
        this.f111422f = 1;
        this.f111419c = bebu.NOT_STARTED;
    }

    public Session(bebw bebw, bebv bebv) {
        this.f111418b = new ArrayList();
        this.f111420d = bkxy.f125432a;
        this.f111426j = bkxw.f125425e.mo74144da();
        int i = bebv.f106887a;
        if (i == 0 || i == 1) {
            throw new IllegalArgumentException("must set a valid SessionType");
        }
        bxvd bxvd = this.f111426j;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkxw bkxw = (bkxw) bxvd.f164949b;
        bkxw.f125430d = i - 1;
        bkxw.f125427a |= 32;
        bxvd da = bkxu.f125420c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkxu bkxu = (bkxu) da.f164949b;
        bkxu.f125423b = 3;
        bkxu.f125422a = 1 | bkxu.f125422a;
        this.f111421e = (bkxu) da.mo74062i();
        mo60603a(bebw);
    }
}
