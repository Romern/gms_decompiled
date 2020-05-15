package p000;

import android.util.MutableBoolean;
import android.util.Pair;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xeb {

    /* renamed from: a */
    final /* synthetic */ MutableBoolean f52046a;

    /* renamed from: b */
    final /* synthetic */ xwn f52047b;

    /* renamed from: c */
    final /* synthetic */ xkb f52048c;

    /* renamed from: d */
    final /* synthetic */ String f52049d;

    /* renamed from: e */
    final /* synthetic */ CountDownLatch f52050e;

    /* renamed from: f */
    final /* synthetic */ AtomicReference f52051f;

    /* renamed from: g */
    final /* synthetic */ xec f52052g;

    public xeb(xec xec, MutableBoolean mutableBoolean, xwn xwn, xkb xkb, String str, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.f52052g = xec;
        this.f52046a = mutableBoolean;
        this.f52047b = xwn;
        this.f52048c = xkb;
        this.f52049d = str;
        this.f52050e = countDownLatch;
        this.f52051f = atomicReference;
    }

    /* renamed from: a */
    public final void mo29677a(xma xma) {
        int i;
        xec.f52053f.mo25417e("User verification failed", xma, new Object[0]);
        this.f52046a.value = true;
        try {
            xwn xwn = this.f52047b;
            xwj xwj = this.f52052g.f52054c;
            wzs wzs = wzs.EVENT_TYPE_SIGN_ASSERTION_ERROR;
            wzu a = xec.m42753a(this.f52048c);
            if (!this.f52049d.equals("google.com")) {
                i = 0;
            } else {
                i = 2;
            }
            xwn.mo30193a(xwj, wzs, a, i, xma);
        } catch (xma e) {
            xec.f52053f.mo25417e("Error logging ESK event", e, new Object[0]);
        }
        this.f52050e.countDown();
    }

    /* renamed from: a */
    public final void mo29678a(byte[] bArr, xpj xpj) {
        int i;
        try {
            xwn xwn = this.f52047b;
            xwj xwj = this.f52052g.f52054c;
            wzs wzs = wzs.EVENT_TYPE_SIGN_ASSERTION_SUCCESS;
            wzu a = xec.m42753a(this.f52048c);
            if (!this.f52049d.equals("google.com")) {
                i = 0;
            } else {
                i = 2;
            }
            xwn.mo30193a(xwj, wzs, a, i, null);
        } catch (xma e) {
            xec.f52053f.mo25417e("Error logging ESK event", e, new Object[0]);
        }
        this.f52051f.set(new Pair(bArr, xpj));
        this.f52050e.countDown();
    }
}
