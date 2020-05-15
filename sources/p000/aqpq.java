package p000;

import android.graphics.Bitmap;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.ImageReference;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpq implements aquu, aqvr {

    /* renamed from: a */
    public boolean f86516a;

    /* renamed from: b */
    public boolean f86517b;

    /* renamed from: c */
    private boolean f86518c;

    /* renamed from: d */
    private final tie f86519d;

    /* renamed from: e */
    private final aqvx f86520e;

    /* renamed from: f */
    private Bitmap f86521f;

    /* renamed from: g */
    private final List f86522g = new ArrayList();

    /* renamed from: h */
    private bzij f86523h;

    public aqpq(tie tie, aqvx aqvx) {
        this.f86519d = tie;
        this.f86520e = aqvx;
    }

    /* renamed from: a */
    private final void m71932a(bzij bzij) {
        if (!bzij.f170190b.isEmpty()) {
            mo48041a(bzij.f170190b);
        }
    }

    /* renamed from: a */
    public final void mo48037a(aqpp aqpp) {
        Bitmap bitmap;
        this.f86522g.add(aqpp);
        if (!this.f86517b && (bitmap = this.f86521f) != null) {
            aqpp.mo48036a(bitmap);
        }
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        if (aqqw.mo48087c()) {
            bzij bzij = aqqw.f86628d;
            if (bzij.f170193e) {
                this.f86517b = true;
            } else if (this.f86516a) {
            } else {
                if (this.f86518c) {
                    m71932a(bzij);
                } else {
                    this.f86523h = bzij;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48039a(bmxv bmxv) {
        if (!this.f86517b && bmxv.mo66813a()) {
            this.f86521f = (Bitmap) bmxv.mo66814b();
            List list = this.f86522g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((aqpp) list.get(i)).mo48036a(this.f86521f);
            }
        }
    }

    /* renamed from: a */
    public final void mo48040a(Person person) {
        ImageReference g;
        this.f86518c = true;
        if (!this.f86516a && !this.f86517b) {
            if (person.mo41054y()) {
                List list = ((PersonImpl) person).f81747n;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Person.Images images = (Person.Images) list.get(i);
                    if (!images.mo40928f() && (g = images.mo46312g()) != null && g.mo40914c()) {
                        mo48041a(g.mo40915d());
                        return;
                    }
                }
            }
            bzij bzij = this.f86523h;
            if (bzij != null) {
                m71932a(bzij);
            }
        }
    }

    /* renamed from: a */
    public final void mo48041a(String str) {
        this.f86516a = true;
        if (str.startsWith("content://com.android.contacts/display_photo/")) {
            aqvx aqvx = this.f86520e;
            aqvx.f86949a.initLoader(13, null, new aqvw(aqvx, str, new aqpn(this)));
            return;
        }
        this.f86519d.mo26557a(tey.m36894b(str), 13, new aqpo(this));
    }
}
