package p000;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Arrays;
import java.util.List;

/* renamed from: upx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class upx {

    /* renamed from: a */
    public final DriveId f48499a;

    /* renamed from: b */
    public final String f48500b;

    /* renamed from: c */
    public final String f48501c;

    /* renamed from: d */
    public final String f48502d;

    /* renamed from: e */
    public final String f48503e;

    /* renamed from: f */
    public final MetadataBundle f48504f;

    /* renamed from: g */
    public final List f48505g;

    /* renamed from: h */
    public final List f48506h;

    /* renamed from: i */
    public final int f48507i;

    /* renamed from: j */
    public final String f48508j;

    public upx(DriveId driveId, String str, String str2, String str3, String str4, MetadataBundle metadataBundle, List list, List list2, int i, String str5) {
        sdo.m34959a(driveId);
        this.f48499a = driveId;
        this.f48500b = str;
        sdo.m34959a((Object) str2);
        this.f48501c = str2;
        this.f48502d = str3;
        this.f48503e = str4;
        this.f48504f = metadataBundle;
        sdo.m34959a(list);
        this.f48505g = list;
        sdo.m34959a(list2);
        this.f48506h = list2;
        this.f48507i = i;
        this.f48508j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(upx.class)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        upx upx = (upx) obj;
        return sdg.m34949a(upx.f48500b, this.f48500b) && sdg.m34949a(upx.f48501c, this.f48501c) && sdg.m34949a(upx.f48502d, this.f48502d) && sdg.m34949a(upx.f48504f, this.f48504f) && sdg.m34949a(upx.f48503e, this.f48503e) && sdg.m34949a(upx.f48506h, this.f48506h) && sdg.m34949a(upx.f48505g, this.f48505g) && sdg.m34949a(upx.f48508j, this.f48508j) && sdg.m34949a(Integer.valueOf(upx.f48507i), Integer.valueOf(this.f48507i)) && sdg.m34949a(upx.f48499a, this.f48499a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48500b, this.f48501c, this.f48502d, this.f48503e, this.f48504f, this.f48506h, this.f48505g, this.f48508j, Integer.valueOf(this.f48507i), this.f48499a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48499a);
        String str = this.f48500b;
        String str2 = this.f48501c;
        String str3 = this.f48502d;
        String str4 = this.f48503e;
        String valueOf2 = String.valueOf(this.f48504f);
        String join = TextUtils.join(",", this.f48505g);
        String join2 = TextUtils.join(",", this.f48506h);
        int i = this.f48507i;
        String str5 = this.f48508j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = str2.length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(str4).length();
        int length6 = String.valueOf(valueOf2).length();
        int length7 = String.valueOf(join).length();
        StringBuilder sb = new StringBuilder(length + 241 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(join2).length() + String.valueOf(str5).length());
        sb.append("CompletionEventInfo{mDriveId=");
        sb.append(valueOf);
        sb.append(", mRequestedAccountName='");
        sb.append(str);
        sb.append("', mResolvedAccountName='");
        sb.append(str2);
        sb.append("', mBaseContentHash='");
        sb.append(str3);
        sb.append("', mModifiedContentHash='");
        sb.append(str4);
        sb.append("', mModifiedMetadataBundle=");
        sb.append(valueOf2);
        sb.append(", mTrackingTags=[");
        sb.append(join);
        sb.append("], mActionTypes=[");
        sb.append(join2);
        sb.append("], mStatus=");
        sb.append(i);
        sb.append(", mOverrideServicePackageName='");
        sb.append(str5);
        sb.append("'}");
        return sb.toString();
    }
}
