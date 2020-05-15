package p000;

import java.util.concurrent.Callable;
import javax.crypto.Mac;

/* renamed from: ackx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ackx implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f60053a;

    public ackx(String str) {
        this.f60053a = str;
    }

    /* renamed from: a */
    public final Mac call() {
        return Mac.getInstance(this.f60053a);
    }
}
