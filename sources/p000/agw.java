package p000;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agw {

    /* renamed from: a */
    public final AtomicInteger f525a = new AtomicInteger(0);

    /* renamed from: b */
    public final Map f526b = new HashMap();

    /* renamed from: c */
    public final Map f527c = new HashMap();

    /* renamed from: d */
    public final Bundle f528d = new Bundle();

    /* renamed from: e */
    private final transient Map f529e = new HashMap();

    /* renamed from: a */
    public final boolean mo689a(int i, int i2, Intent intent) {
        String str = (String) this.f526b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        agv agv = (agv) this.f529e.get(str);
        this.f528d.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }
}
