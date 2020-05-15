package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LogContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjsw();

    /* renamed from: a */
    public final LogContext f151793a;

    /* renamed from: b */
    public final LogContext f151794b;

    /* renamed from: c */
    public final ArrayList f151795c;

    /* renamed from: d */
    public final long f151796d;

    /* renamed from: e */
    public final int f151797e;

    /* renamed from: f */
    public boolean f151798f;

    /* renamed from: g */
    public final ArrayList f151799g = new ArrayList();

    /* renamed from: h */
    private final Session f151800h;

    public LogContext(Parcel parcel) {
        this.f151797e = parcel.readInt();
        this.f151794b = (LogContext) parcel.readParcelable(getClass().getClassLoader());
        boolean z = true;
        if (parcel.readInt() == 1) {
            this.f151793a = this;
            this.f151800h = (Session) parcel.readParcelable(Session.class.getClassLoader());
        } else {
            this.f151793a = (LogContext) parcel.readParcelable(getClass().getClassLoader());
            this.f151800h = null;
        }
        this.f151796d = parcel.readLong();
        this.f151798f = parcel.readInt() != 1 ? false : z;
        this.f151795c = new ArrayList(10);
    }

    /* renamed from: a */
    public final void mo71780a(bjsx bjsx) {
        this.f151799g.add(bjsx);
    }

    /* renamed from: a */
    public final boolean mo71781a() {
        return this == this.f151793a;
    }

    /* renamed from: b */
    public final Session mo71783b() {
        return !mo71781a() ? this.f151793a.mo71783b() : this.f151800h;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f151797e);
        parcel.writeParcelable(this.f151794b, 0);
        parcel.writeInt(mo71781a() ? 1 : 0);
        if (mo71781a()) {
            parcel.writeParcelable(this.f151800h, 0);
        } else {
            parcel.writeParcelable(this.f151793a, 0);
        }
        parcel.writeLong(this.f151796d);
        parcel.writeInt(this.f151798f ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo71784b(bjsx bjsx) {
        this.f151799g.remove(bjsx);
    }

    /* renamed from: a */
    public final long[] mo71782a(int i) {
        LogContext logContext = this.f151794b;
        long[] a = logContext != null ? logContext.mo71782a(i + 1) : new long[(i + 1)];
        a[i] = this.f151796d;
        return a;
    }

    public LogContext(LogContext logContext, long j, int i) {
        if (logContext != null) {
            this.f151797e = i;
            this.f151794b = logContext;
            this.f151793a = logContext.f151793a;
            this.f151800h = null;
            this.f151796d = j;
            this.f151795c = new ArrayList(10);
            this.f151794b.f151795c.add(this);
            bjsz.m104546a().mo65516a(mo71783b().f151801a, this);
            return;
        }
        throw new IllegalArgumentException("Parent context can not be null.");
    }

    public LogContext(Session session, long j, int i) {
        this.f151797e = i;
        this.f151794b = null;
        this.f151793a = this;
        this.f151800h = session;
        this.f151796d = j;
        this.f151795c = new ArrayList(10);
        bjsz.m104546a().mo65516a(mo71783b().f151801a, this);
    }
}
