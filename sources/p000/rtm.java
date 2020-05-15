package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: rtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rtm implements rtp {

    /* renamed from: a */
    public final DataHolder f43665a;

    protected rtm(DataHolder dataHolder) {
        this.f43665a = dataHolder;
    }

    /* renamed from: a */
    public int mo24660a() {
        DataHolder dataHolder = this.f43665a;
        if (dataHolder != null) {
            return dataHolder.f30168h;
        }
        return 0;
    }

    /* renamed from: a */
    public abstract Object mo24661a(int i);

    /* renamed from: b */
    public final Bundle mo24662b() {
        return this.f43665a.f30166f;
    }

    /* renamed from: c */
    public void mo12460c() {
        DataHolder dataHolder = this.f43665a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final void close() {
        mo12460c();
    }

    public final Iterator iterator() {
        return new rtq(this);
    }
}
