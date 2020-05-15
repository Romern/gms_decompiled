package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: jni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jni {

    /* renamed from: a */
    public RemoteDevice f22872a;

    /* renamed from: b */
    public final Map f22873b = new LinkedHashMap();

    /* renamed from: c */
    public final SparseArray f22874c = new SparseArray();

    /* renamed from: d */
    public final SparseBooleanArray f22875d = new SparseBooleanArray();

    public jni(RemoteDevice remoteDevice) {
        this.f22872a = remoteDevice;
    }

    public final String toString() {
        return String.format("[remoteDevice=%s, featureToConnectionModeMap=%s, secureChannels=%s]", this.f22872a.mo7784a(), this.f22873b, this.f22874c.toString());
    }
}
