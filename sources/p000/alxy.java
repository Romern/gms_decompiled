package p000;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: alxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alxy extends sio {

    /* renamed from: c */
    private static final HashMap f74542c;

    /* renamed from: a */
    public final Set f74543a = new HashSet();

    /* renamed from: b */
    public List f74544b;

    static {
        HashMap hashMap = new HashMap();
        f74542c = hashMap;
        hashMap.put("items", FastJsonResponse$Field.m22657b("items", 2, Person.class));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f74542c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f74544b;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo17863c(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo17864d(String str) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alxy)) {
            return false;
        }
        if (this != obj) {
            alxy alxy = (alxy) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f74542c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!alxy.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(alxy.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (alxy.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f74542c.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f74544b = arrayList;
            this.f74543a.add(Integer.valueOf(i));
            return;
        }
        String canonicalName = arrayList.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known array of custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        String canonicalName = sio.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not a known custom type.  Found ");
        sb.append(canonicalName);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f74543a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
