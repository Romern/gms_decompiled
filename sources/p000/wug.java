package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.p001v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class wug {
    /* renamed from: a */
    public static wug m42283a(Context context, Uri uri) {
        apy apy;
        try {
            apy = new apy(context, uri);
        } catch (IllegalStateException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wug", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("ListSliceBuilderWrapper: Meet exception when constructing ListBuilder!");
            apy = null;
        }
        if (apy != null) {
            return new wue(apy);
        }
        int i = Build.VERSION.SDK_INT;
        return new wuf(context, uri);
    }

    /* renamed from: a */
    public abstract Slice mo29408a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29409a(int i);

    /* renamed from: a */
    public abstract void mo29410a(PendingIntent pendingIntent, IconCompat iconCompat, String str, String str2, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo29411a(apr apr, Uri uri, bmxj bmxj) {
        PendingIntent pendingIntent;
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        wum wum = new wum(atomicReference, countDownLatch, apr, uri);
        apr.mo2274a(uri, wum);
        try {
            wum.mo2272a(apr.mo2277c(uri));
            countDownLatch.await(cfog.f184854a.mo6606a().mo81987aV(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | InterruptedException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wup", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Error waiting for slice binding for uri %s", uri.toString());
            apr.mo2276b(uri, wum);
        }
        ArrayList a = wup.m42310a((Slice) atomicReference.get());
        if (a.isEmpty()) {
            return false;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            wuo wuo = (wuo) a.get(i);
            if (!cfoj.f184966a.mo6606a().mo82114al()) {
                pendingIntent = wuo.mo29424d();
            } else {
                pendingIntent = (PendingIntent) bmxj.apply(wuo.mo29424d());
            }
            mo29410a(pendingIntent, wuo.mo29423c(), wuo.mo29421a(), wuo.mo29422b(), true);
        }
        return true;
    }
}
