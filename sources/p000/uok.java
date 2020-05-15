package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: uok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uok implements uof {

    /* renamed from: a */
    public final uoc f48403a = new uoc();

    /* renamed from: b */
    public final List f48404b = new ArrayList();

    /* renamed from: c */
    private String f48405c = null;

    /* renamed from: d */
    private final Collection f48406d = new ArrayList();

    /* renamed from: e */
    private boolean f48407e = false;

    /* renamed from: f */
    private String f48408f = null;

    private uok(String str) {
        bmxy.m108581a(str);
        this.f48405c = str;
    }

    /* renamed from: a */
    public static uok m39087a(String str) {
        return new uok(str);
    }

    /* renamed from: b */
    public final void mo27771b() {
        this.f48407e = true;
    }

    public final String toString() {
        return mo27759a();
    }

    /* renamed from: a */
    public static uok m39088a(unt unt) {
        return new uok(unt.mo27735b());
    }

    /* renamed from: b */
    public final void mo27772b(String str) {
        bmxy.m108600b(this.f48408f == null);
        this.f48408f = str;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List, java.util.Collection], assign insn: 0x009a: IGET  (r1v9 ? I:java.util.Collection) = (r7v0 'this' uok A[THIS]) uok.d java.util.Collection */
    /* renamed from: a */
    public final String mo27759a() {
        StringBuilder sb = new StringBuilder("SELECT ");
        if (this.f48407e) {
            sb.append('*');
            if (!this.f48403a.f48380a.isEmpty()) {
                sb.append(", ");
                uoc uoc = this.f48403a;
                uoc uoc2 = new uoc();
                for (Map.Entry entry : uoc.f48380a.entrySet()) {
                    String str = (String) entry.getValue();
                    String str2 = (String) entry.getKey();
                    if (!str.equals(str2)) {
                        uoc2.mo27755a(str, str2);
                    }
                }
                sb.append(uoc2.toString());
            }
        } else {
            sb.append(this.f48403a.toString());
        }
        sb.append(" FROM ");
        sb.append(this.f48405c);
        if (this.f48408f != null) {
            sb.append(" WHERE ");
            sb.append(this.f48408f);
        }
        if (!this.f48404b.isEmpty()) {
            sb.append(" ORDER BY ");
            sb.append(TextUtils.join(", ", this.f48404b));
        }
        if (!this.f48406d.isEmpty()) {
            ? r1 = this.f48406d;
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(((uoj) r1.get(i)).mo27759a());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final uoe mo27766a(uod uod, uof uof) {
        return new uoe(uod, this, uof);
    }

    /* renamed from: a */
    public final void mo27767a(String str, String str2) {
        this.f48403a.mo27755a(str, str2);
    }

    /* renamed from: a */
    public final void mo27768a(uoc uoc, String str, String str2) {
        uoc uoc2 = this.f48403a;
        for (Map.Entry entry : uoc.f48380a.entrySet()) {
            uoc2.mo27755a(str + "." + ((String) entry.getValue()), str2 + "." + ((String) entry.getKey()));
        }
    }

    /* renamed from: a */
    public final void mo27769a(uoj uoj) {
        Collection collection = this.f48406d;
        bmxy.m108581a(uoj);
        collection.add(uoj);
    }

    /* renamed from: a */
    public final void mo27770a(vpj vpj) {
        String a = ((unp) vpj.mo27461b()).mo27700a();
        mo27767a(a, a);
    }
}
