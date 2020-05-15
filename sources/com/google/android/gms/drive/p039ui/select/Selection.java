package com.google.android.gms.drive.p039ui.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.drive.ui.select.Selection */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Selection implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vna();

    /* renamed from: a */
    public static final sbw f31198a = new sbw("Selection", "");

    /* renamed from: b */
    public Filter f31199b;

    /* renamed from: c */
    public DriveId f31200c;

    /* renamed from: d */
    public twz f31201d;

    /* renamed from: e */
    private final rkl f31202e = new vnb(this);

    /* renamed from: f */
    private final Set f31203f;

    /* renamed from: a */
    public final void mo18331a() {
        for (vnc vnc : this.f31203f) {
            vnc.mo28630c();
        }
    }

    /* renamed from: b */
    public final void mo18335b(twz twz) {
        if ((this.f31201d == null || !twz.mo26854a().equals(this.f31200c)) && mo18334a(twz)) {
            this.f31200c = twz.mo26854a();
            this.f31201d = (twz) twz.mo7556bF();
            mo18331a();
        }
    }

    /* renamed from: b */
    public final boolean mo18337b() {
        return this.f31201d != null || this.f31200c == null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new FilterHolder(this.f31199b), i);
        parcel.writeParcelable(this.f31200c, i);
    }

    public Selection(Filter filter, DriveId driveId) {
        this.f31199b = filter;
        this.f31203f = new HashSet();
        this.f31200c = driveId;
        this.f31201d = null;
    }

    /* renamed from: a */
    public final void mo18332a(rkb rkb, DriveId driveId) {
        driveId.mo18114c().mo27953a(rkb).mo9458a(this.f31202e);
    }

    /* renamed from: a */
    public final void mo18333a(vnc vnc) {
        this.f31203f.add(vnc);
        if (mo18337b()) {
            vnc.mo28630c();
        }
    }

    /* renamed from: b */
    public final void mo18336b(vnc vnc) {
        this.f31203f.remove(vnc);
    }

    /* renamed from: a */
    public final boolean mo18334a(twz twz) {
        return ((Boolean) this.f31199b.mo18284a(new vfs(twz))).booleanValue();
    }
}
