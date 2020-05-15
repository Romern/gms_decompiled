package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwj {

    /* renamed from: a */
    public final rsk f69937a;

    /* renamed from: b */
    public final CountDownLatch f69938b = new CountDownLatch(1);

    /* renamed from: c */
    private final rsg f69939c;

    public aiwj(Context context, String str) {
        rsg rsg = aiwi.f69936a;
        this.f69939c = rsg;
        this.f69937a = rsk.m34337b(context, str, 1, rsg);
    }

    /* renamed from: b */
    public static SubscribeRequest m58074b(Bundle bundle) {
        return (SubscribeRequest) bundle.getParcelable("s");
    }

    /* renamed from: c */
    public static PendingIntent m58075c(Bundle bundle) {
        SubscribeRequest b = m58074b(bundle);
        if (b != null) {
            return b.f80765f;
        }
        return null;
    }

    /* renamed from: d */
    public static long m58076d(Bundle bundle) {
        return bundle.getLong("t");
    }

    /* renamed from: e */
    public static ClientAppIdentifier m58077e(Bundle bundle) {
        byte[] byteArray = bundle.getByteArray("i");
        if (byteArray == null) {
            return null;
        }
        ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) sef.m35069a(byteArray, ClientAppIdentifier.CREATOR);
        if (clientAppIdentifier.f80670e == 0) {
            clientAppIdentifier.f80670e = 1;
        }
        return clientAppIdentifier;
    }

    /* renamed from: f */
    public static String m58078f(Bundle bundle) {
        return bundle.getString("d");
    }

    /* renamed from: a */
    public final void mo38159a() {
        if (!this.f69938b.await(20000, TimeUnit.MILLISECONDS)) {
            throw new TimeoutException();
        }
    }

    /* renamed from: b */
    public final List mo38162b() {
        return this.f69937a.mo25074e();
    }

    /* renamed from: a */
    public final void mo38160a(PendingIntent pendingIntent) {
        SubscribeRequest subscribeRequest = new SubscribeRequest(null, null, null, null, pendingIntent, null, false, 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("s", subscribeRequest);
        this.f69937a.mo25067b(bundle);
    }

    /* renamed from: a */
    public final void mo38161a(Bundle bundle) {
        this.f69937a.mo25067b(bundle);
    }
}
