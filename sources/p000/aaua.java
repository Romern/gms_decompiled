package p000;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

/* renamed from: aaua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaua extends CheckBox implements aatq, aavk {

    /* renamed from: a */
    public final EditText f56578a;

    /* renamed from: b */
    public final boolean f56579b;

    /* renamed from: c */
    public aave f56580c;

    /* renamed from: d */
    private final aatr f56581d;

    /* renamed from: e */
    private List f56582e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aatj.a(android.widget.TextView, boolean):void
     arg types: [aaua, boolean]
     candidates:
      aatj.a(android.content.Context, android.widget.CompoundButton):android.widget.EditText
      aatj.a(android.view.View, int):void
      aatj.a(android.widget.TextView, boolean):void */
    public aaua(Context context, aatr aatr, bzqk bzqk) {
        super(context);
        this.f56581d = aatr;
        boolean z = bzqk.f171022f;
        this.f56579b = z;
        if (z) {
            setOnCheckedChangeListener(new aaty(this));
        }
        setTag(bzqk.f171018b);
        Object[] objArr = new Object[2];
        String str = "";
        objArr[0] = (2 & bzqk.f171017a) != 0 ? bzqk.f171019c : str;
        objArr[1] = this.f56579b ? " *" : str;
        setText(String.format("%s%s", objArr));
        setChecked(bzqk.f171020d);
        aatj.m46984a((TextView) this, this.f56579b);
        this.f56578a = bzqk.f171021e ? aatj.m46977a(context, this) : null;
    }

    /* renamed from: a */
    public final void mo31780a(aave aave) {
        this.f56580c = aave;
    }

    /* renamed from: b */
    public final boolean mo31782b() {
        return this.f56581d.getVisibility() == 0;
    }

    /* renamed from: c */
    public final boolean mo31793c() {
        return this.f56578a != null;
    }

    /* renamed from: d */
    public final String mo31794d() {
        return String.valueOf(isChecked());
    }

    /* renamed from: e */
    public final void mo31795e() {
        List list = this.f56582e;
        if (list != null) {
            aavg.m47063a(list);
            aave aave = this.f56580c;
            if (aave != null) {
                aave.mo31824a();
            }
        }
    }

    /* renamed from: a */
    public final void mo31792a(List list) {
        this.f56582e = list;
        setOnCheckedChangeListener(new aatz(this));
    }

    /* renamed from: a */
    public final boolean mo31781a() {
        return isChecked();
    }
}
