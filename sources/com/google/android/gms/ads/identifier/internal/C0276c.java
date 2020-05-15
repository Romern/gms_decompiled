package com.google.android.gms.ads.identifier.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.identifier.settings.C0287e;
import java.util.UUID;

/* renamed from: com.google.android.gms.ads.identifier.internal.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0276c extends dck implements C0277d {

    /* renamed from: a */
    private final C0287e f7994a;

    /* renamed from: b */
    private final Context f7995b;

    public C0276c() {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo6493a() {
        return this.f7994a.mo6512c();
    }

    /* renamed from: b */
    public final String mo6496b(String str, boolean z) {
        String str2;
        String str3;
        spn.m35872c(this.f7995b, str);
        rfz.m33557a(this.f7995b).mo24605a(str);
        if (!z) {
            C0287e eVar = this.f7994a;
            synchronized (eVar.f8021a) {
                if (!eVar.mo6515f()) {
                    str3 = eVar.mo6517h();
                    if (str3.isEmpty()) {
                    }
                }
                String h = eVar.mo6517h();
                if (h.isEmpty()) {
                    h = UUID.randomUUID().toString();
                }
                str3 = eVar.mo6508a(false, eVar.mo6513d(), h, "");
            }
            return str3;
        }
        C0287e eVar2 = this.f7994a;
        synchronized (eVar2.f8021a) {
            if (eVar2.mo6515f()) {
                str2 = eVar2.mo6516g();
                if (!str2.isEmpty()) {
                }
            }
            str2 = eVar2.mo6508a(true, eVar2.mo6513d(), eVar2.mo6517h(), eVar2.mo6514e());
        }
        return str2;
    }

    /* renamed from: c */
    public final boolean mo6497c() {
        return this.f7994a.mo6515f();
    }

    /* renamed from: d */
    public final boolean mo6498d() {
        return this.f7994a.mo6518i();
    }

    /* renamed from: a */
    public final String mo6494a(String str) {
        spn.m35872c(this.f7995b, str);
        rfz.m33557a(this.f7995b).mo24605a(str);
        Intent startIntent = IntentOperation.getStartIntent(this.f7995b, "com.google.android.gms.ads.cache.ClearCacheIntentOperation", "com.google.android.gms.ads.cache.CLEAR");
        if (startIntent != null) {
            this.f7995b.startService(startIntent);
        }
        return this.f7994a.mo6511b();
    }

    public C0276c(byte[] bArr) {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        rpr b = rpr.m34216b();
        this.f7995b = b;
        this.f7994a = C0287e.m5194a(b);
    }

    /* renamed from: a */
    public final void mo6495a(String str, boolean z) {
        spn.m35872c(this.f7995b, str);
        rfz.m33557a(this.f7995b).mo24605a(str);
        this.f7994a.mo6509a(z);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                String a = mo6493a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                dcl.m8167a(parcel);
                boolean d = mo6498d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                return true;
            case 3:
                String a2 = mo6494a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            case 4:
                mo6495a(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                String b = mo6496b(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 6:
                boolean c = mo6497c();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, c);
                return true;
            default:
                return false;
        }
    }
}
