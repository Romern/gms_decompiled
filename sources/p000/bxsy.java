package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bxsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxsy implements bxxb {
    /* renamed from: a */
    public static void m123078a(Iterable iterable, List list) {
        bxwd.m124083a(iterable);
        if (iterable instanceof bxwm) {
            List d = ((bxwm) iterable).mo74191d();
            bxwm bxwm = (bxwm) list;
            int size = list.size();
            for (Object obj : d) {
                if (obj == null) {
                    int size2 = bxwm.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = bxwm.size() - 1; size3 >= size; size3--) {
                        bxwm.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof ByteString) {
                    bxwm.mo74189a((ByteString) obj);
                } else {
                    bxwm.add((String) obj);
                }
            }
        } else if (!(iterable instanceof bxxl)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public abstract bxsy clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73625a(bxsz bxsz);

    /* renamed from: a */
    public abstract void mo73627a(bxuc bxuc, bxus bxus);

    /* renamed from: a */
    public void mo73630a(byte[] bArr, int i) {
        throw null;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo73631a(byte[] bArr, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public void mo73632a(byte[] bArr, int i, bxus bxus) {
        throw null;
    }

    /* renamed from: c */
    public final String mo73636c(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + str.length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo73635b(byte[] bArr, bxus bxus) {
        mo73632a(bArr, bArr.length, bxus);
    }

    /* renamed from: a */
    public final bxsy mo73633b(byte[] bArr) {
        mo73630a(bArr, bArr.length);
        return this;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxb mo73624a(byte[] bArr, bxus bxus) {
        mo73635b(bArr, bxus);
        return this;
    }

    /* renamed from: a */
    public final void mo73626a(bxuc bxuc) {
        mo73627a(bxuc, bxus.m123743b());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73628a(bxxc bxxc) {
        if (mo74067j().getClass().isInstance(bxxc)) {
            mo73625a((bxsz) bxxc);
            return;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    public final void mo73634b(InputStream inputStream) {
        bxuc a = bxuc.m123416a(inputStream);
        mo73626a(a);
        a.mo73787a(0);
    }
}
