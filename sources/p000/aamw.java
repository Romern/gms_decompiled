package p000;

import android.net.Network;

/* renamed from: aamw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aamw {

    /* renamed from: a */
    private Network f28506a;

    /* renamed from: b */
    private String f28507b;

    /* renamed from: c */
    private final boolean f28508c;

    public aamw(String str, boolean z) {
        this.f28507b = str;
        this.f28508c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Network mo17073a() {
        if (!this.f28508c) {
            return null;
        }
        return this.f28506a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo17074a(Network network) {
        if (this.f28508c) {
            this.f28506a = network;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo17075a(String str) {
        if (this.f28508c) {
            this.f28507b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo17076b() {
        if (this.f28508c) {
            this.f28506a = null;
        }
    }

    /* renamed from: c */
    public final synchronized String mo17077c() {
        if (!this.f28508c) {
            return null;
        }
        return this.f28507b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo17078d() {
        if (this.f28508c) {
            this.f28507b = null;
        }
    }
}
