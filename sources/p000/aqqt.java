package p000;

import android.text.TextUtils;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqt implements aquu, aqvr {

    /* renamed from: a */
    private aqqs f86617a;

    /* renamed from: b */
    private boolean f86618b;

    /* renamed from: c */
    private bzij f86619c;

    /* renamed from: d */
    private final List f86620d;

    public aqqt(String str, String str2, String str3) {
        this.f86617a = new aqqs(str, null, str2 == null ? str3 : str2);
        this.f86620d = new ArrayList();
        this.f86618b = false;
    }

    /* renamed from: a */
    private final void m71990a() {
        List list = this.f86620d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aqqr) list.get(i)).mo48046a(this.f86617a);
        }
    }

    /* renamed from: a */
    private final void m71991a(bzij bzij) {
        if (!this.f86617a.mo48081a() || !this.f86617a.mo48082b()) {
            aqqs aqqs = this.f86617a;
            String str = aqqs.f86614a;
            boolean z = true;
            boolean z2 = false;
            if (!aqqs.mo48081a() && !bzij.f170189a.isEmpty()) {
                str = bzij.f170189a;
                z2 = true;
            }
            String str2 = this.f86617a.f86615b;
            if (!bzij.f170192d.isEmpty()) {
                str2 = bzij.f170192d;
            } else {
                z = z2;
            }
            if (z) {
                this.f86617a = new aqqs(str, str2, this.f86617a.f86616c);
                m71990a();
            }
        }
    }

    /* renamed from: a */
    public final void mo48084a(aqqr aqqr) {
        if (this.f86617a.mo48081a() || this.f86617a.mo48083c()) {
            aqqr.mo48046a(this.f86617a);
        }
        this.f86620d.add(aqqr);
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        if (aqqw.mo48087c()) {
            bzij bzij = aqqw.f86628d;
            if (this.f86618b) {
                m71991a(bzij);
            } else {
                this.f86619c = bzij;
            }
        }
    }

    /* renamed from: a */
    public final void mo48040a(Person person) {
        this.f86618b = true;
        if (!this.f86617a.mo48081a() && person.mo40998K()) {
            List list = ((PersonImpl) person).f81754u;
            int size = list.size();
            int i = 0;
            while (i < size) {
                Person.Names names = (Person.Names) list.get(i);
                if (TextUtils.isEmpty(names.mo40957e()) || !"contact".equals(names.mo46297b().mo40937b())) {
                    i++;
                } else {
                    this.f86617a = new aqqs(names.mo40957e(), null, this.f86617a.f86616c);
                    m71990a();
                    return;
                }
            }
        }
        bzij bzij = this.f86619c;
        if (bzij != null) {
            m71991a(bzij);
        }
    }
}
