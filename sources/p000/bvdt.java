package p000;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: bvdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdt {

    /* renamed from: a */
    public final int f155670a;

    /* renamed from: b */
    public final buqh f155671b;

    /* renamed from: c */
    public final LinkedList f155672c;

    /* renamed from: d */
    public int f155673d = 0;

    /* renamed from: e */
    public long f155674e = 0;

    /* renamed from: f */
    public long f155675f;

    /* renamed from: g */
    public boolean f155676g = true;

    /* renamed from: h */
    public final buqn f155677h = new bvdr(this, "STQueue");

    /* renamed from: i */
    public final bvds f155678i;

    /* renamed from: j */
    final /* synthetic */ buxb f155679j;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public bvdt(buxb buxb, buqh buqh, bvds bvds) {
        this.f155679j = buxb;
        sdo.m34971a(true, (Object) null);
        sdo.m34959a(buqh);
        this.f155671b = buqh;
        sdo.m34959a(bvds);
        this.f155678i = bvds;
        this.f155672c = new LinkedList();
        this.f155670a = 3;
        this.f155675f = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    private final void m120998c() {
        this.f155671b.mo72987c(this.f155677h);
    }

    /* renamed from: a */
    public final void mo73344a() {
        this.f155676g = true;
        this.f155673d = 0;
        this.f155674e = 0;
        this.f155675f = SystemClock.elapsedRealtime();
        m120998c();
    }

    /* renamed from: b */
    public final long mo73346b() {
        buxb buxb = this.f155679j;
        UUID uuid = buxb.f155203a;
        byyb byyb = buxb.f155212j.f155567b.f168924g;
        if (byyb == null) {
            byyb = byyb.f168875j;
        }
        return byyb.f168884h;
    }

    /* renamed from: a */
    public final void mo73345a(bvdu... bvduArr) {
        Collections.addAll(this.f155672c, bvduArr);
        m120998c();
    }

    /* renamed from: b */
    public final void mo73347b(bvdu... bvduArr) {
        bvdu bvdu = (bvdu) this.f155672c.peek();
        this.f155672c.removeAll(Arrays.asList(bvduArr));
        if (bvdu == this.f155672c.peek()) {
            m120998c();
        } else {
            mo73344a();
        }
    }
}
