package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: mn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1194mn implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f26681a;

    /* renamed from: b */
    final /* synthetic */ C1193mm f26682b;

    /* renamed from: c */
    final /* synthetic */ int f26683c;

    /* renamed from: d */
    final /* synthetic */ String f26684d;

    public C1194mn(Context context, C1193mm mmVar, int i, String str) {
        this.f26681a = context;
        this.f26682b = mmVar;
        this.f26683c = i;
        this.f26684d = str;
    }

    /* renamed from: a */
    public final C1200mt call() {
        C1200mt a = C1201mu.m19648a(this.f26681a, this.f26682b, this.f26683c);
        if (a.f26693a != null) {
            C1201mu.f26695a.mo15547a(this.f26684d, a.f26693a);
        }
        return a;
    }
}
