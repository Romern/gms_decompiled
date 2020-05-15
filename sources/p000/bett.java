package p000;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: bett */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bett extends betv {

    /* renamed from: a */
    public int f112435a = 0;

    /* renamed from: b */
    public int f112436b = 0;

    /* renamed from: c */
    public boolean f112437c;

    /* renamed from: d */
    final /* synthetic */ beua f112438d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bett(beua beua, boolean z) {
        super(beua);
        this.f112438d = beua;
        this.f112437c = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(long, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(long, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61137a() {
        this.f112438d.f112450c.mo60962a(0L, false);
        berb berb = this.f112438d.f112450c;
        ArrayList arrayList = new ArrayList(berb.f112116D);
        arrayList.add(this);
        berb.f112116D = arrayList;
        beua beua = this.f112438d;
        bgmk bgmk = beua.f112448a;
        beua.mo61145a(SystemClock.elapsedRealtime() + 90000);
    }

    /* renamed from: b */
    public final String mo61140b() {
        return "MaybeLeavingVehicleState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61141c() {
        this.f112437c = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo61142d() {
        beua beua = this.f112438d;
        beua.mo61146a(new bets(beua));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61138a(betv betv) {
        super.mo61138a(betv);
        this.f112438d.f112450c.mo60985c(0);
        berb berb = this.f112438d.f112450c;
        ArrayList arrayList = new ArrayList(berb.f112116D);
        arrayList.remove(this);
        berb.f112116D = arrayList;
    }
}
