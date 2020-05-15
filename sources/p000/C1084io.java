package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: io */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1084io extends C1018gh {

    /* renamed from: Y */
    TextView f21426Y;

    /* renamed from: Z */
    View f21427Z;

    /* renamed from: a */
    ListAdapter f21428a;

    /* renamed from: aa */
    View f21429aa;

    /* renamed from: ab */
    CharSequence f21430ab;

    /* renamed from: ac */
    boolean f21431ac;

    /* renamed from: ad */
    private final Handler f21432ad = new Handler();

    /* renamed from: ae */
    private final Runnable f21433ae = new C1081im(this);

    /* renamed from: af */
    private final AdapterView.OnItemClickListener f21434af = new C1083in(this);

    /* renamed from: b */
    ListView f21435b;

    /* renamed from: c */
    View f21436c;

    /* renamed from: a */
    private final void m15776a(boolean z, boolean z2) {
        m15777j();
        View view = this.f21427Z;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f21431ac != z) {
            this.f21431ac = z;
            if (!z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                    this.f21429aa.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                } else {
                    view.clearAnimation();
                    this.f21429aa.clearAnimation();
                }
                this.f21427Z.setVisibility(0);
                this.f21429aa.setVisibility(8);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                this.f21429aa.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f21429aa.clearAnimation();
            }
            this.f21427Z.setVisibility(8);
            this.f21429aa.setVisibility(0);
        }
    }

    /* renamed from: j */
    private final void m15777j() {
        if (this.f21435b == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f21435b = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.f21426Y = textView;
                    if (textView == null) {
                        this.f21436c = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f21427Z = view.findViewById(16711682);
                    this.f21429aa = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f21435b = listView;
                        View view2 = this.f21436c;
                        if (view2 == null) {
                            CharSequence charSequence = this.f21430ab;
                            if (charSequence != null) {
                                this.f21426Y.setText(charSequence);
                                this.f21435b.setEmptyView(this.f21426Y);
                            }
                        } else {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f21431ac = true;
                this.f21435b.setOnItemClickListener(this.f21434af);
                ListAdapter listAdapter = this.f21428a;
                if (listAdapter != null) {
                    this.f21428a = null;
                    setListAdapter(listAdapter);
                } else if (this.f21427Z != null) {
                    m15776a(false, false);
                }
                this.f21432ad.post(this.f21433ae);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public ListAdapter getListAdapter() {
        return this.f21428a;
    }

    public ListView getListView() {
        m15777j();
        return this.f21435b;
    }

    public long getSelectedItemId() {
        m15777j();
        return this.f21435b.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        m15777j();
        return this.f21435b.getSelectedItemPosition();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.f21432ad.removeCallbacks(this.f21433ae);
        this.f21435b = null;
        this.f21431ac = false;
        this.f21429aa = null;
        this.f21427Z = null;
        this.f21436c = null;
        this.f21426Y = null;
        super.onDestroyView();
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        m15777j();
    }

    public void setEmptyText(CharSequence charSequence) {
        m15777j();
        TextView textView = this.f21426Y;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f21430ab == null) {
                this.f21435b.setEmptyView(this.f21426Y);
            }
            this.f21430ab = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void setListAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f21428a;
        this.f21428a = listAdapter;
        ListView listView = this.f21435b;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f21431ac && listAdapter2 == null) {
                m15776a(true, requireView().getWindowToken() != null);
            }
        }
    }

    public void setListShown(boolean z) {
        m15776a(z, true);
    }

    public void setListShownNoAnimation(boolean z) {
        m15776a(z, false);
    }

    public void setSelection(int i) {
        m15777j();
        this.f21435b.setSelection(i);
    }
}
