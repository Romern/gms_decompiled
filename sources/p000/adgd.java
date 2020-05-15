package p000;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import java.util.List;

/* renamed from: adgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgd extends dcj implements adgf {
    public adgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.instantapps.internal.IInstantAppsService");
    }

    /* renamed from: a */
    public final void mo33452a(adgc adgc) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, adgc);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo33453a(adgc adgc, Intent intent) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33454a(adgc adgc, Intent intent, RoutingOptions routingOptions) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33455a(adgc adgc, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33456a(adgc adgc, String str, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33457a(adgc adgc, String str, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33458a(adgc adgc, List list, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33459a(rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33460a(rnt rnt, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33461a(rnt rnt, int i, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33462a(rnt rnt, PackageInfo packageInfo) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33463a(rnt rnt, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33465a(rnt rnt, String str, String str2, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33466a(rnt rnt, String str, String str2, String str3) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33467a(rnt rnt, String str, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33468a(rnt rnt, String str, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo33469a(rnt rnt, boolean z) {
        throw null;
    }

    /* renamed from: b */
    public final void mo33470b(adgc adgc) {
        throw null;
    }

    /* renamed from: b */
    public final void mo33471b(adgc adgc, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo33472b(rnt rnt) {
        throw null;
    }

    /* renamed from: b */
    public final void mo33474b(rnt rnt, String str, String str2, String str3) {
        throw null;
    }

    /* renamed from: b */
    public final void mo33475b(rnt rnt, boolean z) {
        throw null;
    }

    /* renamed from: c */
    public final void mo33476c(adgc adgc) {
        throw null;
    }

    /* renamed from: c */
    public final void mo33477c(adgc adgc, String str) {
        throw null;
    }

    /* renamed from: c */
    public final void mo33478c(rnt rnt) {
        throw null;
    }

    /* renamed from: c */
    public final void mo33479c(rnt rnt, String str) {
        throw null;
    }

    /* renamed from: d */
    public final void mo33480d(adgc adgc) {
        throw null;
    }

    /* renamed from: d */
    public final void mo33481d(rnt rnt) {
        throw null;
    }

    /* renamed from: d */
    public final void mo33482d(rnt rnt, String str) {
        throw null;
    }

    /* renamed from: e */
    public final void mo33483e(adgc adgc) {
        throw null;
    }

    /* renamed from: e */
    public final void mo33484e(rnt rnt) {
        throw null;
    }

    /* renamed from: b */
    public final void mo33473b(rnt rnt, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo33464a(rnt rnt, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        mo8528b(22, bj);
    }
}
