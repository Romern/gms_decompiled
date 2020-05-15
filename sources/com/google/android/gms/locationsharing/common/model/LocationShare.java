package com.google.android.gms.locationsharing.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationShare extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aetd();

    /* renamed from: a */
    public final ShareTarget f79627a;

    /* renamed from: b */
    public final SharingCondition f79628b;

    /* renamed from: c */
    public int f79629c;

    /* renamed from: d */
    public boolean f79630d;

    public LocationShare(ShareTarget shareTarget, SharingCondition sharingCondition, int i, boolean z) {
        this.f79627a = shareTarget;
        this.f79628b = sharingCondition;
        this.f79629c = i;
        this.f79630d = z;
    }

    /* renamed from: a */
    public static LocationShare m66988a(ShareTarget shareTarget, SharingCondition sharingCondition) {
        return new LocationShare(shareTarget, sharingCondition, 0, false);
    }

    /* renamed from: i */
    private final boolean m66989i() {
        SharingCondition sharingCondition = this.f79628b;
        return sharingCondition != null && sharingCondition.mo43781c() == 3;
    }

    /* renamed from: a */
    public final void mo43754a(int i) {
        this.f79629c = i - 1;
    }

    /* renamed from: b */
    public final AudienceMember mo43755b() {
        ShareTarget shareTarget = this.f79627a;
        AudienceMember audienceMember = shareTarget.f79638a;
        if (audienceMember != null) {
            return audienceMember;
        }
        String str = shareTarget.f79640c;
        String str2 = shareTarget.f79639b;
        String valueOf = String.valueOf(str);
        return AudienceMember.m22641b(valueOf.length() == 0 ? new String("t:") : "t:".concat(valueOf), str2, null);
    }

    /* renamed from: c */
    public final boolean mo43756c() {
        return this.f79627a.mo43775d();
    }

    /* renamed from: d */
    public final String mo43757d() {
        return this.f79627a.mo43774c();
    }

    /* renamed from: e */
    public final String mo43758e() {
        return this.f79627a.f79641d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationShare) {
            LocationShare locationShare = (LocationShare) obj;
            return sdg.m34949a(mo43753a(), locationShare.mo43753a()) && m66989i() == locationShare.m66989i();
        }
    }

    /* renamed from: f */
    public final boolean mo43760f() {
        return this.f79627a.mo43776e();
    }

    /* renamed from: g */
    public final boolean mo43761g() {
        return this.f79629c == 0;
    }

    /* renamed from: h */
    public final int mo43762h() {
        return new int[]{1, 2, 3, 4}[this.f79629c];
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo43753a(), Boolean.valueOf(m66989i())});
    }

    /* renamed from: a */
    public final String mo43753a() {
        return this.f79627a.mo43772a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79627a, i, false);
        see.m35040a(parcel, 2, this.f79628b, i, false);
        see.m35063b(parcel, 4, this.f79629c);
        see.m35051a(parcel, 5, this.f79630d);
        see.m35062b(parcel, a);
    }
}
