package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContext;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MetricsContextImpl implements MetricsContext {
    public static final Parcelable.Creator CREATOR = new kwx();

    /* renamed from: a */
    public final HashMap f11651a = new HashMap();

    /* renamed from: b */
    public final bngs f11652b = bngx.m109377j();

    /* renamed from: c */
    public AtomicInteger f11653c = new AtomicInteger(1);

    /* renamed from: d */
    public int f11654d = 1;

    /* renamed from: e */
    private final int f11655e;

    /* renamed from: f */
    private final kzx f11656f;

    /* renamed from: g */
    private final lbh f11657g;

    public MetricsContextImpl(int i, kzx kzx, lbh lbh) {
        this.f11655e = i;
        this.f11656f = kzx;
        this.f11657g = lbh;
    }

    /* renamed from: a */
    public final int mo7953a() {
        return this.f11655e;
    }

    /* renamed from: b */
    public final kzx mo7956b() {
        return this.f11656f;
    }

    /* renamed from: c */
    public final lbh mo7957c() {
        return this.f11657g;
    }

    /* renamed from: d */
    public final int mo7958d() {
        return this.f11653c.getAndIncrement();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final bngx mo7959e() {
        return this.f11652b.mo67664a();
    }

    public final synchronized void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11655e);
        parcel.writeByteArray(this.f11656f.mo73642k());
        parcel.writeByteArray(this.f11657g.mo73642k());
        parcel.writeInt(this.f11653c.get());
        parcel.writeInt(this.f11654d);
        parcel.writeInt(this.f11651a.size());
        for (Map.Entry entry : this.f11651a.entrySet()) {
            parcel.writeTypedObject((AutofillId) entry.getKey(), i);
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
        parcel.writeTypedList(this.f11652b.mo67664a());
    }

    /* renamed from: a */
    public final synchronized int mo7954a(AutofillId autofillId) {
        if (!this.f11651a.containsKey(autofillId)) {
            HashMap hashMap = this.f11651a;
            int i = this.f11654d;
            this.f11654d = i + 1;
            hashMap.put(autofillId, Integer.valueOf(i));
        }
        return ((Integer) this.f11651a.get(autofillId)).intValue();
    }

    /* renamed from: a */
    public final synchronized void mo7955a(MetricsContext.FillContext fillContext) {
        this.f11652b.mo67668c(fillContext);
    }
}
