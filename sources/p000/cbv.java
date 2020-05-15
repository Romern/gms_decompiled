package p000;

import java.util.List;

/* renamed from: cbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbv extends cbt {
    /* JADX WARNING: Illegal instructions before constructor call */
    public cbv(Class cls, Class cls2) {
        super(r2.toString());
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("Failed to find any ModelLoaders for model: ");
        sb.append(valueOf);
        sb.append(" and data: ");
        sb.append(valueOf2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public cbv(Object obj) {
        super(r1.toString());
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
        sb.append("Failed to find any ModelLoaders registered for model class: ");
        sb.append(valueOf);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public cbv(Object obj, List list) {
        super(r2.toString());
        String valueOf = String.valueOf(list);
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89 + String.valueOf(valueOf2).length());
        sb.append("Found ModelLoaders for model class: ");
        sb.append(valueOf);
        sb.append(", but none that handle this specific model instance: ");
        sb.append(valueOf2);
    }
}
