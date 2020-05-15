package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: avtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avtn {

    /* renamed from: a */
    public static final avsz f93892a = new avtm();

    /* renamed from: b */
    private final SharedPreferences f93893b;

    /* renamed from: c */
    private final Object f93894c = new Object();

    protected avtn(Context context) {
        this.f93893b = context.getSharedPreferences("com.google.android.gms.update.storage", 0);
    }

    /* renamed from: a */
    public final avtc mo51603a(avti avti) {
        return new avtc(avti, mo51607b(avti));
    }

    /* renamed from: b */
    public final Object mo51607b(avti avti) {
        String string;
        synchronized (this.f93894c) {
            string = this.f93893b.getString(avti.f93886a, null);
        }
        return string == null ? avti.f93887b : avti.mo51590a(string);
    }

    /* renamed from: a */
    public final void mo51604a(List list) {
        synchronized (this.f93894c) {
            SharedPreferences.Editor edit = this.f93893b.edit();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                avtc avtc = (avtc) it.next();
                edit.putString(avtc.f93878a.f93886a, avtc.mo51592a());
            }
            edit.commit();
        }
    }

    /* renamed from: a */
    public final void mo51605a(avtc... avtcArr) {
        mo51604a(Arrays.asList(avtcArr));
    }

    /* renamed from: a */
    public final void mo51606a(avti... avtiArr) {
        List<avti> asList = Arrays.asList(avtiArr);
        synchronized (this.f93894c) {
            SharedPreferences.Editor edit = this.f93893b.edit();
            for (avti avti : asList) {
                edit.remove(avti.f93886a);
            }
            edit.commit();
        }
    }
}
