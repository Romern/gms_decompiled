package com.google.android.gms.drive.p039ui.select;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.p039ui.select.path.PathStack;
import com.google.android.gms.drive.p039ui.select.path.SearchPathElement;

/* renamed from: com.google.android.gms.drive.ui.select.SelectFileChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectFileChimeraActivity extends vlf implements vlw, vne {

    /* renamed from: d */
    private vmy f31196d;

    /* renamed from: a */
    public static vml m23085a(Context context, String str, String str2, String str3) {
        return new vml(context, str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo18324e() {
        vmy vmy = this.f31196d;
        PathStack pathStack = vmy.f49552h;
        rkb rkb = vmy.f49551g;
        if (pathStack.f31211c.isEmpty()) {
            if (twn.f46759e.mo26842a(rkb).f48623a.equals(pathStack.f31212d)) {
                pathStack.f31211c = PathStack.m23106a(vnr.f49586a);
                pathStack.mo18346a();
            } else {
                twn.f46759e.mo26843a(rkb, pathStack.f31212d).mo27953a(rkb).mo9458a(new vnk(pathStack));
            }
        }
        Selection selection = vmy.f49553i;
        rkb rkb2 = vmy.f49551g;
        if (!selection.mo18337b()) {
            selection.mo18332a(rkb2, selection.f31200c);
        }
        vmy.mo28653d();
        vmy.mo28652b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void onBackPressed() {
        vmy vmy = this.f31196d;
        vmy.f49555k = null;
        if (vmy.f49552h.mo18351b() != null) {
            PathStack pathStack = vmy.f49552h;
            sdo.m34971a(!pathStack.f31211c.isEmpty(), (Object) "Not initialized yet");
            if (pathStack.f31211c.size() != 1) {
                if (vmy.f49558n.isEnabled()) {
                    vmy.f49552h.mo18348a(vmy.f49551g);
                    return;
                }
                return;
            }
        }
        vmy.mo28650a(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dialogTitle");
        if (stringExtra == null) {
            stringExtra = getString(C0126R.string.drive_pick_entry_dialog_title_pick_an_item);
            intent.putExtra("dialogTitle", stringExtra);
        }
        setTitle(stringExtra);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vmy vmy = (vmy) supportFragmentManager.findFragmentByTag("selectFileFragment");
        this.f31196d = vmy;
        if (vmy == null) {
            vmy vmy2 = new vmy();
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            vmy2.setArguments(extras);
            this.f31196d = vmy2;
            supportFragmentManager.beginTransaction().add(16908290, this.f31196d, "selectFileFragment").commit();
        }
        this.f31196d.setHasOptionsMenu(true);
        if (bundle == null) {
            setResult(0);
        }
    }

    public final boolean onSearchRequested() {
        vmy vmy = this.f31196d;
        if (!vmy.f49551g.mo24805i()) {
            return true;
        }
        if (vmy.f49552h.mo18351b() instanceof SearchPathElement) {
            vmy.f49552h.mo18348a(vmy.f49551g);
            return true;
        }
        vmy.f49552h.mo18347a(new SearchPathElement(""));
        return true;
    }

    /* renamed from: a */
    public final void mo18325a(int i, DriveId driveId) {
        this.f31196d.mo18325a(i, driveId);
    }

    /* renamed from: a */
    public final void mo18326a(voc voc, voa voa) {
        this.f31196d.mo18326a(voc, voa);
    }
}
