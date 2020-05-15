package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;

/* renamed from: anpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anpn extends anpo {

    /* renamed from: j */
    public String f77411j;

    /* renamed from: k */
    public String f77412k;

    /* renamed from: l */
    public String f77413l;

    /* renamed from: m */
    public String f77414m;

    /* renamed from: n */
    public boolean f77415n;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    protected static Bundle m64963b(String str, String str2, String str3, String str4) {
        sdo.m34969a(str, (Object) "Account name must not be empty.");
        Bundle bundle = new Bundle();
        bundle.putString("accountName", str);
        bundle.putString("plusPageId", str2);
        bundle.putString("client_application_id", str3);
        bundle.putString("calling_package_name", str4);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo42029a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo42049e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract BaseAdapter mo42050f();

    /* renamed from: h */
    public final BaseAdapter getListAdapter() {
        return (BaseAdapter) super.getListAdapter();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View a = mo42029a();
        if (a != null) {
            getListView().addHeaderView(a);
        }
        getListView().setItemsCanFocus(true);
        getListView().setDividerHeight(0);
        mo42049e();
        setListAdapter(mo42050f());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f77411j = arguments.getString("accountName");
        this.f77412k = arguments.getString("plusPageId");
        this.f77413l = arguments.getString("client_application_id");
        this.f77414m = arguments.getString("calling_package_name");
        if (TextUtils.isEmpty(this.f77413l)) {
            this.f77413l = "80";
        }
    }

    public void onStart() {
        super.onStart();
        this.f77415n = true;
    }

    public void onStop() {
        this.f77415n = false;
        super.onStop();
    }
}
