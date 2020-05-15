package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.support.p002v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: aar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aar extends C1543zl {

    /* renamed from: c */
    final int f81c;

    /* renamed from: d */
    final int f82d;

    /* renamed from: e */
    public aaq f83e;

    /* renamed from: f */
    private MenuItem f84f;

    public aar(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        int i = Build.VERSION.SDK_INT;
        if (configuration.getLayoutDirection() != 1) {
            this.f81c = 22;
            this.f82d = 21;
            return;
        }
        this.f81c = 21;
        this.f82d = 22;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        C1440vq vqVar;
        C1446vw vwVar;
        aaq aaq;
        aaq aaq2;
        int pointToPosition;
        int i2;
        if (this.f83e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                vqVar = (C1440vq) headerViewListAdapter.getWrappedAdapter();
            } else {
                vqVar = (C1440vq) adapter;
                i = 0;
            }
            C1436vm vmVar = null;
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= vqVar.getCount()) {
                vwVar = null;
            } else {
                vwVar = vqVar.getItem(i2);
            }
            MenuItem menuItem = this.f84f;
            if (menuItem != vwVar) {
                C1443vt vtVar = vqVar.f27416a;
                if (!(menuItem == null || (aaq2 = ((aas) this.f83e).f85a) == null)) {
                    ((C1435vl) aaq2).f27377a.f27381a.removeCallbacksAndMessages(vtVar);
                }
                this.f84f = vwVar;
                if (!(vwVar == null || (aaq = ((aas) this.f83e).f85a) == null)) {
                    C1435vl vlVar = (C1435vl) aaq;
                    vlVar.f27377a.f27381a.removeCallbacksAndMessages(null);
                    int size = vlVar.f27377a.f27382b.size();
                    while (true) {
                        if (i3 < size) {
                            if (vtVar == ((C1436vm) vlVar.f27377a.f27382b.get(i3)).f27379b) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        if (i4 < vlVar.f27377a.f27382b.size()) {
                            vmVar = (C1436vm) vlVar.f27377a.f27382b.get(i4);
                        }
                        vlVar.f27377a.f27381a.postAtTime(new C1434vk(vlVar, vmVar, vwVar, vtVar), vtVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f81c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f1097a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f82d) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((C1440vq) getAdapter()).f27416a.mo16226a(false);
            return true;
        }
    }
}
