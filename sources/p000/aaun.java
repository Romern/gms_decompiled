package p000;

import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aaun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaun extends RadioGroup implements aavk, aatx, aatq {

    /* renamed from: a */
    public aave f56609a = null;

    /* renamed from: b */
    private final List f56610b;

    /* renamed from: c */
    private final boolean f56611c;

    /* renamed from: d */
    private aatr f56612d;

    /* renamed from: e */
    private List f56613e = null;

    public aaun(Context context, aatr aatr, bzqi bzqi) {
        super(context);
        this.f56612d = aatr;
        boolean z = bzqi.f170998d;
        this.f56611c = z;
        if (z) {
            setOnCheckedChangeListener(new aaul(this));
        }
        setTag(bzqi.f170996b);
        this.f56610b = new ArrayList();
        bxwc bxwc = bzqi.f171000f;
        int size = bxwc.size();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            bzqk bzqk = (bzqk) bxwc.get(i3);
            i++;
            aauk aauk = new aauk(context, i, bzqk);
            this.f56610b.add(aauk);
            addView(aauk);
            if (aauk.mo31804a()) {
                EditText editText = aauk.f56606a;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                linearLayout.addView(editText);
                addView(linearLayout);
            }
            if (bzqk.f171020d) {
                i2 = i;
            }
        }
        if (i2 > 0) {
            check(i2);
        }
        this.f56612d.mo31783a(this);
    }

    /* renamed from: f */
    private final aauk m47028f() {
        int checkedRadioButtonId = getCheckedRadioButtonId();
        if (checkedRadioButtonId > 0) {
            return (aauk) findViewById(checkedRadioButtonId);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo31780a(aave aave) {
        this.f56609a = aave;
    }

    /* renamed from: b */
    public final boolean mo31782b() {
        return this.f56612d.getVisibility() == 0;
    }

    /* renamed from: bz */
    public final List mo31788bz() {
        if (this.f56611c) {
            return Collections.singletonList(this);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public final List mo31789c() {
        aauk f = m47028f();
        if (f == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String str = (String) getTag();
        String str2 = (String) f.getTag();
        arrayList.add(aatb.m46961a(str, str2));
        if (f.mo31804a()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("--");
            sb.append(str2);
            arrayList.add(aatb.m46961a(sb.toString(), f.f56606a.getText().toString()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo31794d() {
        aauk f = m47028f();
        if (f != null) {
            return (String) f.getTag();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo31795e() {
        List list = this.f56613e;
        if (list != null) {
            aavg.m47063a(list);
            aave aave = this.f56609a;
            if (aave != null) {
                aave.mo31824a();
            }
        }
    }

    /* renamed from: a */
    public final void mo31792a(List list) {
        this.f56613e = list;
        setOnCheckedChangeListener(new aaum(this));
    }

    /* renamed from: a */
    public final boolean mo31781a() {
        return getCheckedRadioButtonId() > 0;
    }
}
