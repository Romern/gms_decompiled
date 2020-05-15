package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bels */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bels implements beis {

    /* renamed from: b */
    private static final Random f111795b = new Random();

    /* renamed from: a */
    public final bqgg f111796a;

    /* renamed from: c */
    private final qws f111797c;

    /* renamed from: d */
    private final Executor f111798d;

    /* renamed from: e */
    private final bmzi f111799e;

    /* renamed from: f */
    private final bmzi f111800f;

    /* renamed from: g */
    private final bmzi f111801g;

    public bels(belr belr) {
        this.f111797c = belr.f111789a;
        this.f111798d = bqgs.m112813a(belr.f111790b);
        this.f111796a = belr.f111791c;
        this.f111799e = belr.f111792d;
        this.f111800f = belr.f111793e;
        this.f111801g = belr.f111794f;
    }

    /* renamed from: a */
    public static belr m95262a(Context context) {
        return new belr(new qws(context, "ICING", null));
    }

    /* renamed from: c */
    private final void m95265c(bqgg bqgg) {
        bqga.m112786c(this.f111796a, bqgg).mo69216a(new belq(this, bqgg), this.f111798d);
    }

    /* renamed from: b */
    public final void mo60748b(bqgg bqgg) {
        m95265c(bqgg);
    }

    /* renamed from: a */
    private static Object m95263a(bmzi bmzi, Object obj) {
        Object a = bmzi.mo6606a();
        return a != null ? a : obj;
    }

    /* renamed from: a */
    private static boolean m95264a(int i) {
        return i > 0 && f111795b.nextInt(i) == 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bels.a(bmzi, java.lang.Object):java.lang.Object
     arg types: [bmzi, int]
     candidates:
      bels.a(bpyq, int):void
      bels.a(bmzi, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo60744a(int i, long j, TimeUnit timeUnit) {
        int intValue = ((Integer) m95263a(this.f111799e, (Object) 0)).intValue();
        if (m95264a(intValue)) {
            this.f111798d.execute(new beln(this, i, j, timeUnit, intValue));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bels.a(bmzi, java.lang.Object):java.lang.Object
     arg types: [bmzi, int]
     candidates:
      bels.a(bpyq, int):void
      bels.a(bmzi, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo60745a(int i, Set set, int i2, int i3) {
        int intValue = ((Integer) m95263a(this.f111801g, (Object) 0)).intValue();
        if (m95264a(intValue)) {
            this.f111798d.execute(new belp(this, i, set, i2, i3, intValue));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bels.a(bmzi, java.lang.Object):java.lang.Object
     arg types: [bmzi, int]
     candidates:
      bels.a(bpyq, int):void
      bels.a(bmzi, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo60746a(int i, Set set, long j, TimeUnit timeUnit) {
        int intValue = ((Integer) m95263a(this.f111800f, (Object) 0)).intValue();
        if (m95264a(intValue)) {
            this.f111798d.execute(new belo(this, i, set, j, timeUnit, intValue));
        }
    }

    /* renamed from: a */
    public final void mo60785a(bpyq bpyq, int i) {
        bxvd da = bpxb.f139606R.mo74144da();
        long j = (long) i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxb bpxb = (bpxb) da.f164949b;
        bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpxb.f139643s = j;
        bpyq.getClass();
        bpxb.f139620M = bpyq;
        bpxb.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        qwo a = this.f111797c.mo24335a(((bpxb) da.mo74062i()).serializeToBytes());
        a.mo24328b(bpzd.m112421a(17002));
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo60747a(bqgg bqgg) {
        m95265c(bqgg);
    }
}
