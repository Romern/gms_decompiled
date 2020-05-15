package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqa implements epw {

    /* renamed from: a */
    private final C0953ec f15505a;

    /* renamed from: b */
    private final C0942ds f15506b;

    /* renamed from: c */
    private final C0958eh f15507c;

    public eqa(C0953ec ecVar) {
        this.f15505a = ecVar;
        this.f15506b = new epx(ecVar);
        new epy(ecVar);
        this.f15507c = new epz(ecVar);
    }

    /* renamed from: a */
    public final List mo10399a() {
        Long l;
        C0956ef a = C0956ef.m10280a("SELECT * FROM dismissed_prompt_item", 0);
        this.f15505a.mo9943e();
        Cursor a2 = this.f15505a.mo9937a(a);
        try {
            int a3 = C0962el.m10613a(a2, "accountName");
            int a4 = C0962el.m10613a(a2, "promptItemId");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                String string = a2.getString(a3);
                if (!a2.isNull(a4)) {
                    l = Long.valueOf(a2.getLong(a4));
                } else {
                    l = null;
                }
                arrayList.add(new eqb(string, l));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo10064b();
        }
    }

    /* renamed from: b */
    public final void mo10402b() {
        this.f15505a.mo9943e();
        C0939dp b = this.f15507c.mo10124b();
        this.f15505a.mo9944f();
        try {
            b.mo9363b();
            this.f15505a.mo9946h();
        } finally {
            this.f15505a.mo9945g();
            this.f15507c.mo10123a(b);
        }
    }

    /* renamed from: a */
    public final void mo10400a(List list) {
        this.f15505a.mo9943e();
        StringBuilder a = C0964en.m10746a();
        a.append("DELETE FROM dismissed_prompt_item WHERE accountName NOT IN (");
        C0964en.m10747a(a, list.size());
        a.append(")");
        C0939dp a2 = this.f15505a.mo9938a(a.toString());
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            if (str == null) {
                a2.mo8917a(i);
            } else {
                a2.mo8919a(i, str);
            }
            i++;
        }
        this.f15505a.mo9944f();
        try {
            a2.mo9363b();
            this.f15505a.mo9946h();
        } finally {
            this.f15505a.mo9945g();
        }
    }

    /* renamed from: a */
    public final void mo10401a(eqb... eqbArr) {
        this.f15505a.mo9943e();
        this.f15505a.mo9944f();
        try {
            this.f15506b.mo9524a(eqbArr);
            this.f15505a.mo9946h();
        } finally {
            this.f15505a.mo9945g();
        }
    }
}
