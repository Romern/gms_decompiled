package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anpr extends RelativeLayout implements Checkable, CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: a */
    private View f77416a;

    /* renamed from: d */
    public Object f77417d;

    /* renamed from: e */
    protected CheckBox f77418e;

    /* renamed from: f */
    public anpq f77419f;

    /* renamed from: g */
    public boolean f77420g;

    public anpr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo42095a() {
        this.f77419f = null;
        this.f77418e.setVisibility(0);
        mo42096a(true);
    }

    /* renamed from: b */
    public final void mo42097b(boolean z) {
        this.f77416a.setVisibility(!z ? 8 : 0);
    }

    /* renamed from: d */
    public final void mo42098d() {
        this.f77418e.setVisibility(8);
    }

    public final boolean isChecked() {
        return this.f77418e.isChecked();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        anpq anpq = this.f77419f;
        if (anpq != null) {
            anpq.mo42059a(this, z);
        }
    }

    public void onClick(View view) {
        if (view.getId() != C0126R.C0129id.audience_selection_checkbox) {
            CheckBox checkBox = this.f77418e;
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f77416a = findViewById(C0126R.C0129id.top_border);
        CheckBox checkBox = (CheckBox) findViewById(C0126R.C0129id.audience_selection_checkbox);
        this.f77418e = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        setOnClickListener(this);
    }

    public void setChecked(boolean z) {
        this.f77418e.setChecked(z);
    }

    public final void toggle() {
        this.f77418e.toggle();
    }

    /* renamed from: a */
    public final void mo42096a(boolean z) {
        setClickable(z);
        setFocusable(z);
    }
}
