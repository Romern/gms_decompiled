package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShareTarget extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new ajsm();

    /* renamed from: a */
    public final long f81028a;

    /* renamed from: b */
    public final String f81029b;

    /* renamed from: c */
    public final Uri f81030c;

    /* renamed from: d */
    public final int f81031d;

    /* renamed from: e */
    public final Bundle f81032e;

    /* renamed from: f */
    public final List f81033f;

    /* renamed from: g */
    public final List f81034g;

    /* renamed from: h */
    public final List f81035h;

    /* renamed from: i */
    public final boolean f81036i;

    /* renamed from: j */
    public final String f81037j;

    /* renamed from: k */
    public final boolean f81038k;

    /* renamed from: l */
    public final String f81039l;

    /* renamed from: m */
    public final PendingIntent f81040m;

    /* renamed from: n */
    public final boolean f81041n;

    public ShareTarget(long j, String str, Uri uri, int i, Bundle bundle, List list, List list2, List list3, boolean z, String str2, boolean z2, String str3, PendingIntent pendingIntent, boolean z3) {
        this.f81028a = j;
        this.f81029b = str;
        this.f81030c = uri;
        this.f81031d = i;
        this.f81032e = bundle;
        this.f81033f = list;
        this.f81034g = list2;
        this.f81035h = list3;
        this.f81036i = z;
        this.f81037j = str2;
        this.f81038k = z2;
        this.f81039l = str3;
        this.f81040m = pendingIntent;
        this.f81041n = z3;
    }

    /* renamed from: a */
    public final ShareTarget clone() {
        try {
            return (ShareTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final List mo44499b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f81034g);
        arrayList.addAll(this.f81033f);
        arrayList.addAll(this.f81035h);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ShareTarget) {
            ShareTarget shareTarget = (ShareTarget) obj;
            if (!sdg.m34949a(Long.valueOf(this.f81028a), Long.valueOf(shareTarget.f81028a)) || !sdg.m34949a(this.f81029b, shareTarget.f81029b) || !sdg.m34949a(this.f81030c, shareTarget.f81030c) || !sdg.m34949a(Integer.valueOf(this.f81031d), Integer.valueOf(shareTarget.f81031d)) || !sdg.m34949a(Boolean.valueOf(this.f81036i), Boolean.valueOf(shareTarget.f81036i)) || !sdg.m34949a(this.f81037j, shareTarget.f81037j) || !sdg.m34949a(Boolean.valueOf(this.f81038k), Boolean.valueOf(shareTarget.f81038k)) || !sdg.m34949a(this.f81039l, shareTarget.f81039l) || !sdg.m34949a(Boolean.valueOf(this.f81041n), Boolean.valueOf(shareTarget.f81041n))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f81028a), this.f81029b, this.f81030c, Integer.valueOf(this.f81031d), Boolean.valueOf(this.f81036i), this.f81037j, Boolean.valueOf(this.f81038k), this.f81039l, Boolean.valueOf(this.f81041n)});
    }

    public final String toString() {
        return String.format(Locale.US, "ShareTarget<id: %d, deviceName: %s, fullName: %s, imageUri: %s, fileAttachmentSize: %d, textAttachmentSize: %d, wifiCredentialsAttachmentSize %d, isKnown: %s, isIncoming: %s, groupName: %s, action: %s, isExternal: %s>", Long.valueOf(this.f81028a), this.f81029b, this.f81037j, this.f81030c, Integer.valueOf(this.f81034g.size()), Integer.valueOf(this.f81033f.size()), Integer.valueOf(this.f81035h.size()), Boolean.valueOf(this.f81038k), Boolean.valueOf(this.f81036i), this.f81039l, this.f81040m, Boolean.valueOf(this.f81041n));
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f81028a);
        see.m35046a(parcel, 2, this.f81029b, false);
        see.m35040a(parcel, 3, this.f81030c, i, false);
        see.m35063b(parcel, 4, this.f81031d);
        see.m35037a(parcel, 5, this.f81032e, false);
        see.m35066c(parcel, 6, this.f81033f, false);
        see.m35066c(parcel, 7, this.f81034g, false);
        see.m35066c(parcel, 8, this.f81035h, false);
        see.m35051a(parcel, 9, this.f81036i);
        see.m35046a(parcel, 10, this.f81037j, false);
        see.m35051a(parcel, 11, this.f81038k);
        see.m35046a(parcel, 12, this.f81039l, false);
        see.m35040a(parcel, 13, this.f81040m, i, false);
        see.m35051a(parcel, 14, this.f81041n);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo44496a(FileAttachment fileAttachment) {
        this.f81034g.add(fileAttachment);
    }

    /* renamed from: a */
    public final void mo44497a(TextAttachment textAttachment) {
        this.f81033f.add(textAttachment);
    }

    /* renamed from: a */
    public final void mo44498a(WifiCredentialsAttachment wifiCredentialsAttachment) {
        this.f81035h.add(wifiCredentialsAttachment);
    }
}
