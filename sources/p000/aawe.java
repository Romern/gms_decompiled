package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: aawe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aawe extends abh {

    /* renamed from: a */
    public final C1245ok f56690a = new C1245ok();

    /* renamed from: d */
    public final List f56691d;

    /* renamed from: e */
    public final List f56692e;

    /* renamed from: f */
    public List f56693f;

    /* renamed from: g */
    public final List f56694g;

    /* renamed from: h */
    public long f56695h;

    /* renamed from: i */
    public long f56696i;

    /* renamed from: j */
    public int f56697j = 0;

    /* renamed from: k */
    public boolean f56698k = false;

    /* renamed from: l */
    public String f56699l;

    /* renamed from: m */
    public String f56700m;

    /* renamed from: n */
    public final ChatConversationChimeraActivity f56701n;

    /* renamed from: o */
    public long f56702o;

    /* renamed from: p */
    public final Handler f56703p;

    /* renamed from: q */
    public final Runnable f56704q;

    /* renamed from: r */
    private final InputFilter f56705r;

    /* renamed from: s */
    private abdx f56706s;

    /* renamed from: t */
    private long f56707t;

    public aawe(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        ColorStateList colorStateList;
        long j;
        int i;
        abdp abdp;
        String str = "";
        this.f56700m = str;
        this.f56706s = abdx.NO_TEXT_ENTERED;
        this.f56707t = 0;
        this.f56702o = 0;
        this.f56703p = new adzt(Looper.getMainLooper());
        this.f56701n = chatConversationChimeraActivity;
        if (aayi.m47270b()) {
            colorStateList = ColorStateList.valueOf(aayi.m47263a(this.f56701n, C0126R.attr.gh_primaryBlueColor));
        } else {
            colorStateList = chatConversationChimeraActivity.getResources().getColorStateList(C0126R.color.gh_chat_survey_link_color_list);
        }
        this.f56705r = new aavw(this, chatConversationChimeraActivity, chatConversationChimeraActivity.getResources().getDimensionPixelSize(C0126R.dimen.gh_chat_message_link_font_size), colorStateList);
        this.f56704q = new aavx(this);
        this.f56692e = new ArrayList();
        ArrayList arrayList = new ArrayList(0);
        int size = arrayList.size();
        this.f56691d = new ArrayList(size);
        this.f56693f = new ArrayList(size);
        this.f56694g = new ArrayList(size);
        if (size != 0) {
            bxyl bxyl = ((abdf) arrayList.get(0)).f57081e;
            j = (bxyl == null ? bxyl.f165099b : bxyl).f165101a;
        } else {
            j = 0;
        }
        this.f56695h = j;
        this.f56696i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            abdf abdf = (abdf) arrayList.get(i2);
            if (abdf.f57078b == 3) {
                abdp = (abdp) abdf.f57079c;
            } else {
                abdp = abdp.f57112g;
            }
            this.f56691d.add(abdp);
            List list = this.f56693f;
            bxyl bxyl2 = abdf.f57081e;
            list.add(m47074a((bxyl2 == null ? bxyl.f165099b : bxyl2).f165101a, 0));
            if (i2 < size - 1) {
                this.f56694g.add(Boolean.valueOf(!mo31847a((abdf) arrayList.get(i2 + 1))));
            } else {
                this.f56694g.add(true);
                bxyl bxyl3 = abdf.f57081e;
                this.f56696i = (bxyl3 == null ? bxyl.f165099b : bxyl3).f165101a;
            }
            if (!str.equals(abdp.f57115b)) {
                this.f56690a.put(Integer.valueOf(this.f56697j), Integer.valueOf(i2));
                this.f56697j++;
            }
            str = abdp.f57115b;
        }
        if (aaya.m47228a(cefw.m136749b())) {
            i = this.f56697j + this.f56692e.size() + 2;
            this.f56697j = i;
        } else {
            i = this.f56697j + this.f56692e.size() + 1;
            this.f56697j = i;
        }
        mo177c(0, i);
    }

    /* renamed from: a */
    static final aasm m47073a(bzoy bzoy) {
        String valueOf = String.valueOf(bzoy.f170887f);
        return aasm.m46877a(bzoy, bzoy.f170888g, bzoy.f170889h, valueOf.length() == 0 ? new String("help://action/") : "help://action/".concat(valueOf));
    }

    /* renamed from: h */
    private final boolean m47078h(int i) {
        return i == 0 || ((Boolean) this.f56694g.get(i + -1)).booleanValue();
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f56697j;
    }

    /* renamed from: c */
    public final int mo31849c() {
        return this.f56697j - 2;
    }

    /* renamed from: d */
    public final int mo31850d() {
        return this.f56690a.f26809h;
    }

    /* renamed from: e */
    public final int mo31851e() {
        return this.f56692e.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo31852f(int i) {
        return !TextUtils.equals(((abdp) this.f56691d.get(i)).f57115b, this.f56699l);
    }

    /* renamed from: g */
    public final int mo31853g(int i) {
        return mo31850d() + i;
    }

    /* renamed from: a */
    public static final String m47074a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j + j2);
        return new SimpleDateFormat("h:mm aa", Locale.getDefault()).format(instance.getTime());
    }

    /* renamed from: a */
    static String m47075a(String str, String str2) {
        return String.format("%s • %s", str, str2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m47076a(LayoutInflater layoutInflater, LinearLayout linearLayout, boolean z, int i, abdp abdp) {
        View view;
        int i2;
        int i3;
        LayoutInflater layoutInflater2 = layoutInflater;
        LinearLayout linearLayout2 = linearLayout;
        int i4 = i;
        abdp abdp2 = abdp;
        if (!z) {
            view = layoutInflater2.inflate((int) C0126R.C0128layout.gh_chat_transcript_inbound_message, (ViewGroup) linearLayout2, true);
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.gh_transcript_message_agent_initial);
            if (i4 == 2 || i4 == 4) {
                if (!TextUtils.isEmpty(abdp2.f57117d)) {
                    textView.setText(String.valueOf(abdp2.f57117d.charAt(0)));
                }
                textView.setBackground(aaxm.m47170a(aayi.m47263a(this.f56701n, C0126R.attr.gh_chatAgentInitialCircleBackgroundColor)));
            } else {
                textView.setVisibility(4);
            }
        } else {
            if (!aaya.m47229b(ceiq.f182728a.mo6606a().mo79177b())) {
                i3 = C0126R.C0128layout.gh_chat_transcript_outbound_message_deprecated;
            } else {
                i3 = C0126R.C0128layout.gh_chat_transcript_outbound_message;
            }
            view = layoutInflater2.inflate(i3, (ViewGroup) linearLayout2, true);
        }
        View findViewById = view.findViewById(C0126R.C0129id.gh_transcript_message_text);
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56701n;
        Resources resources = chatConversationChimeraActivity.getResources();
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(C0126R.dimen.gh_chat_bubble_round_corner_radius);
        float dimensionPixelSize2 = (float) resources.getDimensionPixelSize(C0126R.dimen.gh_chat_bubble_sharp_corner_radius);
        int i5 = i4 - 1;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(i5 != 0 ? i5 != 1 ? i5 != 2 ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize} : z ^ aatj.m46986a(resources) ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize} : new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2} : z ^ aatj.m46986a(resources) ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize} : new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize} : z ^ aatj.m46986a(resources) ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize} : new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2}, null, null));
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0126R.dimen.gh_chat_bubble_padding_horizontal);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C0126R.dimen.gh_chat_bubble_padding_vertical);
        shapeDrawable.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        Paint paint = shapeDrawable.getPaint();
        if (!z) {
            i2 = C0126R.attr.gh_chatInboundMessageBackgroundColor;
        } else {
            i2 = C0126R.attr.gh_primaryBlueColor;
        }
        paint.setColor(aayi.m47263a(chatConversationChimeraActivity, i2));
        findViewById.setBackground(shapeDrawable);
    }

    /* renamed from: a */
    static final void m47077a(View view, boolean z) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0126R.C0129id.gh_transcript_message_spacing_component);
        if (z) {
            linearLayout.setVisibility(4);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final int mo31844a(long j) {
        aawc aawc = new aawc();
        bxvd da = abdq.f57120e.mo74144da();
        bxyl a = bxyl.m124413a(j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abdq abdq = (abdq) da.f164949b;
        a.getClass();
        abdq.f57124c = a;
        abdq.f57122a |= 2;
        return Collections.binarySearch(this.f56692e, (abdq) da.mo74062i(), aawc);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new aawd(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.gh_chat_transcript_message_container, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo31845a(abdx abdx) {
        if (abdx == abdx.NO_TEXT_ENTERED) {
            this.f56703p.removeCallbacks(this.f56704q);
            this.f56697j--;
            this.f56706s = abdx;
            if (aaya.m47228a(cefw.m136749b())) {
                mo160O(this.f56697j - 2);
            } else {
                mo160O(this.f56697j - 1);
            }
        } else {
            if (this.f56706s == abdx.NO_TEXT_ENTERED) {
                this.f56703p.postDelayed(this.f56704q, (long) ((int) ceeg.m136401f()));
                this.f56697j++;
            }
            this.f56706s = abdx;
            if (aaya.m47228a(cefw.m136749b())) {
                mo158M(mo31849c() - 1);
                mo158M(mo31849c());
                return;
            }
            mo158M(this.f56697j - 2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aawe.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      aawe.a(long, long):java.lang.String
      aawe.a(java.lang.String, java.lang.String):java.lang.String
      aawe.a(android.view.ViewGroup, int):acm
      aawe.a(acm, int):void
      aawe.a(android.widget.TextView, java.lang.String):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      aawe.a(android.view.View, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        abdp abdp;
        int i2;
        int i3;
        View.OnClickListener onClickListener;
        int i4 = i;
        aawd aawd = (aawd) acm;
        if (i4 >= this.f56697j) {
            Log.w("gH_ChatConvoLytAdapter", String.format("Trying to bind ViewHolder for position %d, but the position is out of bound.", Integer.valueOf(i)));
            return;
        }
        aawd.f56689s.removeAllViews();
        ViewGroup viewGroup = null;
        if (i4 == this.f56697j - 1) {
            aawd.f56689s.addView(LayoutInflater.from(aawd.f56689s.getContext()).inflate((int) C0126R.C0128layout.gh_chat_transcript_bottom_padding, (ViewGroup) null));
        } else if (aaya.m47228a(cefw.m136749b()) && i4 == mo31849c()) {
            abdp abdp2 = (abdp) bnjd.m109591c(this.f56691d, (Object) null);
            if (abdp2 != null) {
                abea abea = abdp2.f57119f;
                if (abea == null) {
                    abea = abea.f57161c;
                }
                if (abea.f57164b.size() != 0 && this.f56692e.isEmpty() && !this.f56698k && this.f56701n.mo43254B()) {
                    LayoutInflater from = LayoutInflater.from(aawd.f56689s.getContext());
                    View inflate = from.inflate((int) C0126R.C0128layout.gh_chat_transcript_smart_reply_container, (ViewGroup) null);
                    ChipGroup chipGroup = (ChipGroup) inflate.findViewById(C0126R.C0129id.gh_chat_transcript_smart_reply_chip_group);
                    abea abea2 = abdp2.f57119f;
                    if (abea2 == null) {
                        abea2 = abea.f57161c;
                    }
                    String str = abea2.f57163a;
                    abea abea3 = abdp2.f57119f;
                    if (abea3 == null) {
                        abea3 = abea.f57161c;
                    }
                    bxwc bxwc = abea3.f57164b;
                    int size = bxwc.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        abeb abeb = (abeb) bxwc.get(i5);
                        Chip chip = (Chip) from.inflate((int) C0126R.C0128layout.gh_chat_transcript_smart_reply_chip, (ViewGroup) null);
                        chip.setText(abeb.f57169b);
                        bhgf bhgf = chip.f151140b;
                        if (bhgf != null) {
                            bhgf.mo63710d(false);
                        }
                        chip.setOnClickListener(new aavv(this, chip, str, abeb));
                        chip.setContentDescription(this.f56701n.getString(C0126R.string.gh_chat_smart_reply_announcement, new Object[]{abeb.f57169b}));
                        chipGroup.addView(chip);
                    }
                    ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56701n;
                    abcx.m47497a(str, 2, (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, chatConversationChimeraActivity, chatConversationChimeraActivity.f78879q, chatConversationChimeraActivity.f78880r);
                    aawd.f56689s.addView(inflate);
                }
            }
        } else if (i4 != mo31850d() + mo31851e()) {
            int d = mo31850d();
            int i6 = C0126R.C0129id.gh_transcript_message_item_component;
            int i7 = C0126R.C0128layout.gh_chat_transcript_message_component;
            if (i4 < d) {
                C1245ok okVar = this.f56690a;
                Integer valueOf = Integer.valueOf(i);
                Integer num = (Integer) okVar.get(valueOf);
                if (num == null) {
                    Log.w("gH_ChatConvoLytAdapter", String.format("Trying to bind ViewHolder for position %d, but map has no item at that position.", valueOf));
                } else if (((abdp) this.f56691d.get(num.intValue())) != null) {
                    LayoutInflater from2 = LayoutInflater.from(aawd.f56689s.getContext());
                    abdp abdp3 = (abdp) this.f56691d.get(num.intValue());
                    int intValue = num.intValue();
                    int size2 = this.f56691d.size();
                    while (intValue < size2) {
                        abdp abdp4 = (abdp) this.f56691d.get(intValue);
                        if (abdp4 == null) {
                            StringBuilder sb = new StringBuilder(81);
                            sb.append("No message found for index ");
                            sb.append(intValue);
                            sb.append("; this means the message list is corrupted.");
                            Log.w("gH_ChatConvoLytAdapter", sb.toString());
                            return;
                        } else if (TextUtils.equals(abdp4.f57115b, abdp3.f57115b)) {
                            View inflate2 = from2.inflate(i7, viewGroup);
                            LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(i6);
                            String str2 = (String) this.f56693f.get(intValue);
                            boolean equals = TextUtils.equals(this.f56699l, abdp3.f57115b);
                            m47077a(inflate2, equals);
                            if (!((Boolean) this.f56694g.get(intValue)).booleanValue()) {
                                i2 = !m47078h(intValue) ? 3 : 1;
                            } else {
                                i2 = m47078h(intValue) ? 4 : 2;
                            }
                            int i8 = intValue;
                            int i9 = size2;
                            abdp abdp5 = abdp3;
                            LinearLayout linearLayout2 = linearLayout;
                            String str3 = str2;
                            m47076a(from2, linearLayout, equals, i2, abdp4);
                            abdp abdp6 = abdp4;
                            if (abdp6.f57118e.size() != 0) {
                                for (int i10 = 0; i10 < abdp6.f57118e.size(); i10++) {
                                    bzoy bzoy = (bzoy) abdp6.f57118e.get(i10);
                                    aasm a = m47073a(bzoy);
                                    if (a == null) {
                                        String valueOf2 = String.valueOf(bzoy);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                                        sb2.append("Failed to parse action result: ");
                                        sb2.append(valueOf2);
                                        Log.w("gH_ChatConvoLytAdapter", sb2.toString());
                                    } else {
                                        if (a.mo31730m()) {
                                            bzpe bzpe = bzoy.f170884c;
                                            if (bzpe == null) {
                                                bzpe = bzpe.f170904b;
                                            }
                                            onClickListener = new aawa(this, a.f56497g, Uri.parse(bzpe.f170906a));
                                        } else if (!a.mo31731n()) {
                                            String valueOf3 = String.valueOf(bzoy);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                                            sb3.append("Received unsupported action result: ");
                                            sb3.append(valueOf3);
                                            Log.w("gH_ChatConvoLytAdapter", sb3.toString());
                                        } else {
                                            onClickListener = new aawb(this, a);
                                        }
                                        View inflate3 = from2.inflate((int) C0126R.C0128layout.gh_chat_transcript_chat_action, (ViewGroup) linearLayout2, false);
                                        Button button = (Button) inflate3.findViewById(C0126R.C0129id.gh_transcript_chat_action_button);
                                        button.setText(bzoy.f170888g.toUpperCase());
                                        button.setOnClickListener(onClickListener);
                                        linearLayout2.addView(inflate3);
                                    }
                                }
                            }
                            mo31846a((TextView) linearLayout2.findViewById(C0126R.C0129id.gh_transcript_message_text), abdp6.f57116c);
                            if (this.f56698k) {
                                int size3 = this.f56691d.size() - 1;
                                if (!mo31852f(size3)) {
                                    size3 = ((Integer) this.f56690a.get(Integer.valueOf(mo31850d() - 1))).intValue() - 1;
                                }
                                if (i8 == size3) {
                                    View inflate4 = from2.inflate((int) C0126R.C0128layout.gh_chat_transcript_inbound_message_timestamp_and_end_note, (ViewGroup) linearLayout2, true);
                                    abdp3 = abdp5;
                                    ((TextView) inflate4.findViewById(C0126R.C0129id.gh_transcript_message_info)).setText(m47075a(abdp3.f57117d, str3));
                                    ((TextView) inflate4.findViewById(C0126R.C0129id.gh_chat_conversation_ended_note)).setText(inflate4.getContext().getString(C0126R.string.gh_agent_has_ended_chat));
                                    aawd.f56689s.addView(inflate2);
                                    intValue = i8 + 1;
                                    size2 = i9;
                                    i7 = C0126R.C0128layout.gh_chat_transcript_message_component;
                                    viewGroup = null;
                                    i6 = C0126R.C0129id.gh_transcript_message_item_component;
                                } else {
                                    abdp3 = abdp5;
                                    i3 = C0126R.C0129id.gh_transcript_message_info;
                                }
                            } else {
                                abdp3 = abdp5;
                                i3 = C0126R.C0129id.gh_transcript_message_info;
                            }
                            if (((Boolean) this.f56694g.get(i8)).booleanValue()) {
                                String str4 = abdp6.f57117d;
                                if (!equals) {
                                    ((TextView) from2.inflate((int) C0126R.C0128layout.gh_chat_transcript_inbound_message_timestamp, (ViewGroup) linearLayout2, true).findViewById(i3)).setText(m47075a(str4, str3));
                                } else {
                                    ((TextView) from2.inflate((int) C0126R.C0128layout.gh_chat_transcript_outbound_message_timestamp, (ViewGroup) linearLayout2, true).findViewById(i3)).setText(str3);
                                }
                            }
                            aawd.f56689s.addView(inflate2);
                            intValue = i8 + 1;
                            size2 = i9;
                            i7 = C0126R.C0128layout.gh_chat_transcript_message_component;
                            viewGroup = null;
                            i6 = C0126R.C0129id.gh_transcript_message_item_component;
                        } else {
                            return;
                        }
                    }
                } else {
                    Log.w("gH_ChatConvoLytAdapter", String.format("Map should have index of first MessageEvent for ViewHolder position %d, but is null.", num));
                }
            } else {
                LayoutInflater from3 = LayoutInflater.from(aawd.f56689s.getContext());
                int d2 = i4 - mo31850d();
                abdq abdq = (abdq) this.f56692e.get(d2);
                abdp abdp7 = abdq.f57123b;
                if (abdp7 != null) {
                    abdp = abdp7;
                } else {
                    abdp = abdp.f57112g;
                }
                String str5 = abdp.f57116c;
                if (str5.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(97);
                    sb4.append("No pending message found for index ");
                    sb4.append(d2);
                    sb4.append("; this means the pending message list is corrupted.");
                    Log.w("gH_ChatConvoLytAdapter", sb4.toString());
                    return;
                }
                View inflate5 = from3.inflate((int) C0126R.C0128layout.gh_chat_transcript_message_component, (ViewGroup) null);
                LinearLayout linearLayout3 = (LinearLayout) inflate5.findViewById(C0126R.C0129id.gh_transcript_message_item_component);
                m47077a(inflate5, true);
                LinearLayout linearLayout4 = linearLayout3;
                m47076a(from3, linearLayout3, true, 4, abdp);
                TextView textView = (TextView) linearLayout4.findViewById(C0126R.C0129id.gh_transcript_message_text);
                mo31846a(textView, str5);
                if (!abdq.f57125d) {
                    ImageView imageView = (ImageView) inflate5.findViewById(C0126R.C0129id.gh_transcript_message_delete_icon);
                    ChatConversationChimeraActivity chatConversationChimeraActivity2 = this.f56701n;
                    aayh.m47249a(imageView, chatConversationChimeraActivity2, aayi.m47263a(chatConversationChimeraActivity2, C0126R.attr.ghf_greyIconColor));
                    imageView.setVisibility(0);
                    bxyl bxyl = abdq.f57124c;
                    if (bxyl == null) {
                        bxyl = bxyl.f165099b;
                    }
                    imageView.setOnClickListener(new aavy(this, bxyl.f165101a));
                    TextView textView2 = (TextView) from3.inflate((int) C0126R.C0128layout.gh_chat_transcript_message_not_sent_note, (ViewGroup) linearLayout4, true).findViewById(C0126R.C0129id.gh_transcript_message_info);
                    textView2.setText((int) C0126R.string.gh_chat_message_not_sent_text);
                    Drawable a2 = C1133kh.m17836a(this.f56701n, (int) C0126R.C0127drawable.quantum_ic_error_red_18);
                    if (a2 != null) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity3 = this.f56701n;
                        Drawable b = aayh.m47257b(a2, chatConversationChimeraActivity3, aayi.m47263a(chatConversationChimeraActivity3, C0126R.attr.gh_primaryRedColor));
                        int i11 = Build.VERSION.SDK_INT;
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    Context context = textView.getContext();
                    abdq abdq2 = (abdq) this.f56692e.get(d2);
                    abdp abdp8 = abdq2.f57123b;
                    if (abdp8 == null) {
                        abdp8 = abdp.f57112g;
                    }
                    String str6 = abdp8.f57116c;
                    bxyl bxyl2 = abdq2.f57124c;
                    if (bxyl2 == null) {
                        bxyl2 = bxyl.f165099b;
                    }
                    textView.setOnClickListener(new aavz(this, str6, bxyl2.f165101a, context));
                    textView.setContentDescription(String.format("%s.\n%s", str5, textView.getContext().getString(C0126R.string.gh_chat_message_not_sent_text)));
                } else {
                    TextView textView3 = (TextView) from3.inflate((int) C0126R.C0128layout.gh_chat_transcript_outbound_message_timestamp, (ViewGroup) linearLayout4, true).findViewById(C0126R.C0129id.gh_transcript_message_info);
                    textView3.setText(linearLayout4.getContext().getString(C0126R.string.common_sending));
                    textView3.setTypeface(textView3.getTypeface(), 2);
                }
                aawd.f56689s.addView(inflate5);
            }
        } else {
            View inflate6 = LayoutInflater.from(aawd.f56689s.getContext()).inflate((int) C0126R.C0128layout.gh_chat_typing_indicator, (ViewGroup) null);
            TextView textView4 = (TextView) inflate6.findViewById(C0126R.C0129id.gh_chat_typing_indicator_agent_initial);
            if (!TextUtils.isEmpty(this.f56700m)) {
                textView4.setText(String.valueOf(this.f56700m.charAt(0)));
            }
            textView4.setBackground(aaxm.m47170a(aayi.m47263a(this.f56701n, C0126R.attr.gh_chatAgentInitialCircleBackgroundColor)));
            ImageView imageView2 = (ImageView) inflate6.findViewById(C0126R.C0129id.gh_chat_typing_indicator_ellipsis);
            if (this.f56706s == abdx.TYPING) {
                AnimationDrawable a3 = aaxm.m47168a(this.f56701n);
                imageView2.setImageDrawable(a3);
                a3.start();
            } else {
                ChatConversationChimeraActivity chatConversationChimeraActivity4 = this.f56701n;
                imageView2.setImageDrawable(aaxm.m47169a(1, 1, 1, aayi.m47263a(chatConversationChimeraActivity4, C0126R.attr.ghf_greyIconColor), chatConversationChimeraActivity4));
            }
            aawd.f56689s.addView(inflate6);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm
     arg types: [java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, int, int]
     candidates:
      aasm.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):aasm
      aasm.a(java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, aars):java.lang.String
      aasm.a(java.lang.String, java.lang.String, java.util.List, com.google.android.gms.googlehelp.common.HelpConfig, boolean):java.util.Map
      aasm.a(java.lang.String, java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig, boolean, int):aasm */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31846a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        if (aaya.m47229b(ceik.f182717a.mo6606a().mo79167a())) {
            SpannableString valueOf = SpannableString.valueOf(str);
            Linkify.addLinks(valueOf, 15);
            URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    textView.setTextIsSelectable(true);
                    break;
                }
                aasm a = aasm.m46883a(uRLSpanArr[i].getURL(), aasw.m46952a(), this.f56701n.f78879q, true, 2);
                if (a != null && a.mo31733p()) {
                    break;
                }
                i++;
            }
            textView.setText(str);
            Linkify.addLinks(textView, 15);
        }
        textView.setFilters(new InputFilter[]{this.f56705r});
        textView.setText(str);
        Linkify.addLinks(textView, 15);
    }

    /* renamed from: a */
    public final boolean mo31847a(abdf abdf) {
        abdp abdp;
        bxyl bxyl = abdf.f57081e;
        if (bxyl == null) {
            bxyl = bxyl.f165099b;
        }
        if (bxyl.f165101a - this.f56696i > ceeg.f182447a.mo6606a().mo79012g()) {
            return false;
        }
        if (abdf.f57078b == 3) {
            abdp = (abdp) abdf.f57079c;
        } else {
            abdp = abdp.f57112g;
        }
        int size = this.f56691d.size() - 1;
        String str = abdp.f57115b;
        if (size < 0 || !TextUtils.equals(str, ((abdp) this.f56691d.get(size)).f57115b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo31848a(abdx abdx, String str, long j) {
        if (TextUtils.equals(str, this.f56699l) || j < this.f56707t) {
            return false;
        }
        if (abdx == abdx.TYPING || abdx == abdx.TEXT_ENTERED || abdx == abdx.NO_TEXT_ENTERED) {
            this.f56702o = SystemClock.uptimeMillis();
            this.f56707t = j;
            if (this.f56706s == abdx) {
                return false;
            }
            mo31845a(abdx);
            return true;
        }
        Log.w("gH_ChatConvoLytAdapter", String.format("Trying to update the typing indicator using an invalid typing status for the agent: %s", abdx));
        return false;
    }
}
