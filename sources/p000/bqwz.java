package p000;

import java.io.DataOutput;
import java.nio.ByteBuffer;

/* renamed from: bqwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwz extends bqxl implements bqww {

    /* renamed from: h */
    private boolean f141794h = true;

    protected bqwz(bobl bobl, bqwu bqwu) {
        super(bqwx.m113583a(bobl, 10), bqwu);
    }

    /* renamed from: a */
    public final void mo69401a() {
        this.f141794h = false;
        for (bqwu bqwu : this.f141790e.values()) {
            if (bqwu instanceof bqww) {
                ((bqww) bqwu).mo69401a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final short mo69398b() {
        return (short) (this.f141794h ? bqwt.TABLE.f141785q | 4096 : bqwt.TABLE.f141785q);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqwx.a(java.io.DataOutput, java.util.Collection, boolean):java.util.Map
     arg types: [java.io.DataOutput, java.util.Collection, int]
     candidates:
      bqwx.a(bobl, bqwu, bqxe):bqwu
      bqwx.a(java.io.DataOutput, java.util.Collection, boolean):java.util.Map */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        if (this.f141794h) {
            bqwx.m113584a(dataOutput, this.f141790e.values(), true);
        } else {
            super.mo69396a(dataOutput, byteBuffer);
        }
    }
}
