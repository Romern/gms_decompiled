package com.google.android.gms.wallet.p088ui.component.table;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TableRow;

/* renamed from: com.google.android.gms.wallet.ui.component.table.TableRowView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TableRowView extends TableRow implements View.OnClickListener, bjwg {

    /* renamed from: a */
    bjwf f110591a = new bjwf();

    public TableRowView(Context context) {
        super(context);
        setOnClickListener(this);
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f110591a;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return null;
    }

    public void onClick(View view) {
        this.f110591a.mo65585a();
    }

    public TableRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(this);
    }
}
