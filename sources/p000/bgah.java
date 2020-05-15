package p000;

import android.os.Message;
import java.util.Vector;

/* renamed from: bgah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgah {

    /* renamed from: a */
    private final Vector f115874a = new Vector();

    /* renamed from: b */
    private int f115875b = 20;

    /* renamed from: c */
    private int f115876c = 0;

    /* renamed from: d */
    private int f115877d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo62531a() {
        return this.f115874a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized int mo62534b() {
        return this.f115877d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo62535c() {
        this.f115874a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo62536d() {
        this.f115875b = 10;
        this.f115877d = 0;
        this.f115874a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bgag mo62532a(int i) {
        int i2;
        i2 = this.f115876c + i;
        int i3 = this.f115875b;
        if (i2 >= i3) {
            i2 -= i3;
        }
        return i2 < mo62531a() ? (bgag) this.f115874a.get(i2) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo62533a(bgan bgan, Message message, String str, bgaf bgaf, bgaf bgaf2, bgaf bgaf3) {
        this.f115877d++;
        if (this.f115874a.size() < this.f115875b) {
            this.f115874a.add(new bgag(bgan, message, str, bgaf, bgaf2, bgaf3));
            return;
        }
        bgag bgag = (bgag) this.f115874a.get(this.f115876c);
        int i = this.f115876c + 1;
        this.f115876c = i;
        if (i >= this.f115875b) {
            this.f115876c = 0;
        }
        bgag.mo62529a(bgan, message, str, bgaf, bgaf2, bgaf3);
    }
}
