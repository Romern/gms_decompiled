package com.google.android.gms.locationsharing.common.model;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShareTarget extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aetg();

    /* renamed from: a */
    public final AudienceMember f79638a;

    /* renamed from: b */
    public final String f79639b;

    /* renamed from: c */
    public final String f79640c;

    /* renamed from: d */
    public final String f79641d;

    /* renamed from: e */
    public final int f79642e;

    public ShareTarget(AudienceMember audienceMember, String str, String str2, String str3, int i) {
        this.f79638a = audienceMember;
        this.f79639b = str;
        this.f79640c = str2;
        this.f79641d = str3;
        this.f79642e = i;
    }

    /* renamed from: a */
    public static ShareTarget m67006a(Bundle bundle) {
        AudienceMember audienceMember;
        if (bundle != null) {
            String string = bundle.getString("target_share_app_name");
            byte[] byteArray = bundle.getByteArray("target_audience_member");
            if (byteArray != null) {
                audienceMember = (AudienceMember) sef.m35069a(byteArray, AudienceMember.CREATOR);
            } else {
                audienceMember = null;
            }
            String string2 = bundle.getString("target_token_id");
            String string3 = bundle.getString("target_share_links");
            if (audienceMember != null) {
                if (aexk.m52647b(audienceMember)) {
                    return m67007a(audienceMember);
                }
                if (string2 != null) {
                    return m67008a(audienceMember, string2, string3);
                }
                return m67012b(audienceMember);
            } else if (string != null) {
                return m67009a(string, string2, string3);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ShareTarget m67012b(AudienceMember audienceMember) {
        return new ShareTarget(audienceMember, null, null, null, aetf.EMPTY_CONTACT.ordinal());
    }

    /* renamed from: c */
    public final String mo43774c() {
        AudienceMember audienceMember = this.f79638a;
        return audienceMember != null ? audienceMember.f30296f : this.f79639b;
    }

    /* renamed from: d */
    public final boolean mo43775d() {
        return mo43773b() == aetf.GAIA && this.f79638a.mo17847c();
    }

    /* renamed from: e */
    public final boolean mo43776e() {
        return mo43773b().f63769g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShareTarget) {
            return sdg.m34949a(mo43772a(), ((ShareTarget) obj).mo43772a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo43772a()});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f79638a, i, false);
        see.m35046a(parcel, 2, this.f79639b, false);
        see.m35046a(parcel, 3, this.f79640c, false);
        see.m35046a(parcel, 4, this.f79641d, false);
        see.m35063b(parcel, 5, this.f79642e);
        see.m35062b(parcel, a);
    }

    /* renamed from: b */
    public final aetf mo43773b() {
        return aetf.values()[this.f79642e];
    }

    /* renamed from: a */
    public static ShareTarget m67007a(AudienceMember audienceMember) {
        return new ShareTarget(audienceMember, null, null, null, aetf.GAIA.ordinal());
    }

    /* renamed from: a */
    public static ShareTarget m67008a(AudienceMember audienceMember, String str, String str2) {
        return new ShareTarget(audienceMember, null, str, str2, aetf.CONTACT.ordinal());
    }

    /* renamed from: a */
    public static ShareTarget m67009a(String str, String str2, String str3) {
        return new ShareTarget(null, str, str2, str3, aetf.SHARE_APP.ordinal());
    }

    /* renamed from: a */
    public static ArrayList m67010a(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("share_targets");
        if (parcelableArrayListExtra == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(parcelableArrayListExtra.size());
        int size = parcelableArrayListExtra.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m67006a((Bundle) parcelableArrayListExtra.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m67011a(List list, Intent intent) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ShareTarget shareTarget = (ShareTarget) list.get(i);
            Bundle bundle = new Bundle();
            if (shareTarget.mo43776e()) {
                bundle.putString("target_token_id", shareTarget.f79640c);
                bundle.putString("target_share_links", shareTarget.f79641d);
                if (shareTarget.mo43773b() == aetf.CONTACT) {
                    bundle.putByteArray("target_audience_member", sef.m35074a(shareTarget.f79638a));
                } else {
                    bundle.putString("target_share_app_name", shareTarget.f79639b);
                }
            } else {
                bundle.putByteArray("target_audience_member", sef.m35074a(shareTarget.f79638a));
            }
            arrayList.add(bundle);
        }
        intent.putParcelableArrayListExtra("share_targets", arrayList);
    }

    /* renamed from: a */
    public final String mo43772a() {
        if (!mo43776e()) {
            return mo43775d() ? this.f79638a.f30295e.substring(2) : this.f79638a.f30294d;
        }
        return this.f79640c;
    }
}
