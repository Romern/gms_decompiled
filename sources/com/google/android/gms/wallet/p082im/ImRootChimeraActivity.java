package com.google.android.gms.wallet.p082im;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import java.util.List;

/* renamed from: com.google.android.gms.wallet.im.ImRootChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImRootChimeraActivity extends awce {

    /* renamed from: i */
    protected bmsf f110243i;

    /* renamed from: j */
    protected byte[] f110244j;

    /* renamed from: k */
    protected boolean f110245k;

    /* renamed from: l */
    protected boolean f110246l;

    /* renamed from: m */
    protected boolean f110247m = true;

    /* renamed from: n */
    protected boolean f110248n = true;

    /* renamed from: o */
    private TextView f110249o;

    /* renamed from: p */
    private Intent f110250p;

    /* renamed from: q */
    private boolean f110251q = false;

    /* renamed from: a */
    public static Intent m94007a(Context context, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.im.ImRootActivity");
        intent2.putExtras(intent.getExtras());
        return intent2;
    }

    /* renamed from: x */
    private final void m94011x() {
        if (this.f110243i == null) {
            this.f110243i = (bmsf) bjvp.m104729a(getIntent(), "com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", (bxxk) bmsf.f130661f.mo74142c(7));
        }
    }

    /* renamed from: y */
    private final void m94012y() {
        setContentView(mo52134t());
        mo59944u();
        mo59945v();
        awia.m79978a(findViewById(C0126R.C0129id.wallet_root));
        if (((awmv) mo51879e()) == null) {
            mo51866a(mo59946w(), (int) C0126R.C0129id.instrument_manager_container);
        }
    }

    public final void finish() {
        super.finish();
        if (!mo51890q()) {
            overridePendingTransition(0, awia.m79965a(mo51881h()));
        }
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
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a8  */
    public final void onActivityResult(int i, int i2, Intent intent) {
        bmfu bmfu;
        bxvd bxvd;
        boolean z;
        bmhz bmhz;
        boolean z2;
        bmeq bmeq;
        bmeq bmeq2;
        super.onActivityResult(i, i2, intent);
        if (i != 5001) {
            return;
        }
        if (i2 == 0 && ((Boolean) awis.f94490a.mo58455c()).booleanValue()) {
            mo51870b(3);
            return;
        }
        bmik a = bjvn.m104712a(CreditCardOcrResult.m67675a(intent), i2);
        bmsf bmsf = this.f110243i;
        bxvd bxvd2 = (bxvd) bmsf.mo74142c(5);
        bxvd2.mo73625a((bxvk) bmsf);
        bmrv bmrv = this.f110243i.f130665c;
        if (bmrv == null) {
            bmrv = bmrv.f130586g;
        }
        bxvd bxvd3 = (bxvd) bmrv.mo74142c(5);
        bxvd3.mo73625a((bxvk) bmrv);
        bmrv bmrv2 = this.f110243i.f130665c;
        if (bmrv2 == null) {
            bmrv2 = bmrv.f130586g;
        }
        bmrx bmrx = bmrv2.f130592e;
        if (bmrx == null) {
            bmrx = bmrx.f130597t;
        }
        int i3 = bmrx.f130600b;
        if (i3 == 2) {
            bmfu = (bmfu) bmrx.f130601c;
        } else {
            if (i3 == 1) {
                bmeq = (bmeq) bmrx.f130601c;
            } else {
                bmeq = bmeq.f128990h;
            }
            if ((bmeq.f128992a & 8) != 0) {
                if (bmrx.f130600b == 1) {
                    bmeq2 = (bmeq) bmrx.f130601c;
                } else {
                    bmeq2 = bmeq.f128990h;
                }
                bmfu = bmeq2.f128996e;
                if (bmfu == null) {
                    bmfu = bmfu.f129167j;
                }
            }
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bmrv bmrv3 = (bmrv) bxvd3.f164949b;
            bmrx.getClass();
            bmrv3.f130592e = bmrx;
            bmrv3.f130588a |= 8;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bmsf bmsf2 = (bmsf) bxvd2.f164949b;
            bmrv bmrv4 = (bmrv) bxvd3.mo74062i();
            bmsf bmsf3 = bmsf.f130661f;
            bmrv4.getClass();
            bmsf2.f130665c = bmrv4;
            bmsf2.f130663a |= 2;
            this.f110243i = (bmsf) bxvd2.mo74062i();
            m94012y();
        }
        bxvd bxvd4 = (bxvd) bmfu.mo74142c(5);
        bxvd4.mo73625a((bxvk) bmfu);
        int i4 = bmfu.f129169a;
        if ((i4 & 1) != 0) {
            bmhy bmhy = bmfu.f129170b;
            if (bmhy == null) {
                bmhy = bmhy.f129503u;
            }
            if ((bmhy.f129505a & 16) == 0) {
                bmhz = (bmhz) bmia.f129522m.mo74144da();
            } else {
                bmhy bmhy2 = bmfu.f129170b;
                if (bmhy2 == null) {
                    bmhy2 = bmhy.f129503u;
                }
                bmia bmia = bmhy2.f129512h;
                if (bmia == null) {
                    bmia = bmia.f129522m;
                }
                bxvd bxvd5 = (bxvd) bmia.mo74142c(5);
                bxvd5.mo73625a((bxvk) bmia);
                bmhz = (bmhz) bxvd5;
            }
            bmhy bmhy3 = bmfu.f129170b;
            if (bmhy3 == null) {
                bmhy3 = bmhy.f129503u;
            }
            bmia bmia2 = bmhy3.f129512h;
            if (bmia2 == null) {
                bmia2 = bmia.f129522m;
            }
            if (bmia2.f129533j.size() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34971a(z2, (Object) "Shouldn't overwrite existing input results from server");
            bmhy bmhy4 = bmfu.f129170b;
            if (bmhy4 == null) {
                bmhy4 = bmhy.f129503u;
            }
            bxvd bxvd6 = (bxvd) bmhy4.mo74142c(5);
            bxvd6.mo73625a((bxvk) bmhy4);
            if (bmhz.f164950c) {
                bmhz.mo74035c();
                bmhz.f164950c = false;
            }
            ((bmia) bmhz.f164949b).f129533j = bxvk.m124030de();
            bmhz.mo66794a(a);
            if (bxvd6.f164950c) {
                bxvd6.mo74035c();
                bxvd6.f164950c = false;
            }
            bmhy bmhy5 = (bmhy) bxvd6.f164949b;
            bmia bmia3 = (bmia) bmhz.mo74062i();
            bmia3.getClass();
            bmhy5.f129512h = bmia3;
            bmhy5.f129505a |= 16;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bmfu bmfu2 = (bmfu) bxvd4.f164949b;
            bmhy bmhy6 = (bmhy) bxvd6.mo74062i();
            bmfu bmfu3 = bmfu.f129167j;
            bmhy6.getClass();
            bmfu2.f129170b = bmhy6;
            bmfu2.f129169a |= 1;
        } else if ((i4 & 32) != 0) {
            bmhi bmhi = bmfu.f129175g;
            if (bmhi == null) {
                bmhi = bmhi.f129409r;
            }
            if ((bmhi.f129411a & 2) == 0) {
                bxvd = bmhj.f129426h.mo74144da();
            } else {
                bmhi bmhi2 = bmfu.f129175g;
                if (bmhi2 == null) {
                    bmhi2 = bmhi.f129409r;
                }
                bmhj bmhj = bmhi2.f129413c;
                if (bmhj == null) {
                    bmhj = bmhj.f129426h;
                }
                bxvd bxvd7 = (bxvd) bmhj.mo74142c(5);
                bxvd7.mo73625a((bxvk) bmhj);
                bxvd = bxvd7;
            }
            if (((bmhj) bxvd.f164949b).f129433f.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "Shouldn't overwrite existing input results from server");
            bmhi bmhi3 = bmfu.f129175g;
            if (bmhi3 == null) {
                bmhi3 = bmhi.f129409r;
            }
            bxvd bxvd8 = (bxvd) bmhi3.mo74142c(5);
            bxvd8.mo73625a((bxvk) bmhi3);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((bmhj) bxvd.f164949b).f129433f = bxvk.m124030de();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmhj bmhj2 = (bmhj) bxvd.f164949b;
            a.getClass();
            bmhj2.mo66792b();
            bmhj2.f129433f.add(a);
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bmhi bmhi4 = (bmhi) bxvd8.f164949b;
            bmhj bmhj3 = (bmhj) bxvd.mo74062i();
            bmhj3.getClass();
            bmhi4.f129413c = bmhj3;
            bmhi4.f129411a |= 2;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            bmfu bmfu4 = (bmfu) bxvd4.f164949b;
            bmhi bmhi5 = (bmhi) bxvd8.mo74062i();
            bmfu bmfu5 = bmfu.f129167j;
            bmhi5.getClass();
            bmfu4.f129175g = bmhi5;
            bmfu4.f129169a |= 32;
        }
        bxvd bxvd9 = (bxvd) bmrx.mo74142c(5);
        bxvd9.mo73625a((bxvk) bmrx);
        bmrx bmrx2 = (bmrx) bxvd9.f164949b;
        int i5 = bmrx2.f130600b;
        if (i5 == 2) {
            if (bxvd9.f164950c) {
                bxvd9.mo74035c();
                bxvd9.f164950c = false;
            }
            bmrx bmrx3 = (bmrx) bxvd9.f164949b;
            bmfu bmfu6 = (bmfu) bxvd4.mo74062i();
            bmfu6.getClass();
            bmrx3.f130601c = bmfu6;
            bmrx3.f130600b = 2;
        } else if (i5 == 1) {
            bmeq bmeq3 = (bmeq) bmrx2.f130601c;
            if ((bmeq3.f128992a & 8) != 0) {
                bxvd bxvd10 = (bxvd) bmeq3.mo74142c(5);
                bxvd10.mo73625a((bxvk) bmeq3);
                if (bxvd10.f164950c) {
                    bxvd10.mo74035c();
                    bxvd10.f164950c = false;
                }
                bmeq bmeq4 = (bmeq) bxvd10.f164949b;
                bmfu bmfu7 = (bmfu) bxvd4.mo74062i();
                bmeq bmeq5 = bmeq.f128990h;
                bmfu7.getClass();
                bmeq4.f128996e = bmfu7;
                bmeq4.f128992a |= 8;
                if (bxvd9.f164950c) {
                    bxvd9.mo74035c();
                    bxvd9.f164950c = false;
                }
                bmrx bmrx4 = (bmrx) bxvd9.f164949b;
                bmeq bmeq6 = (bmeq) bxvd10.mo74062i();
                bmeq6.getClass();
                bmrx4.f130601c = bmeq6;
                bmrx4.f130600b = 1;
            }
        }
        bmrx = (bmrx) bxvd9.mo74062i();
        if (bxvd3.f164950c) {
        }
        bmrv bmrv32 = (bmrv) bxvd3.f164949b;
        bmrx.getClass();
        bmrv32.f130592e = bmrx;
        bmrv32.f130588a |= 8;
        if (bxvd2.f164950c) {
        }
        bmsf bmsf22 = (bmsf) bxvd2.f164949b;
        bmrv bmrv42 = (bmrv) bxvd3.mo74062i();
        bmsf bmsf32 = bmsf.f130661f;
        bmrv42.getClass();
        bmsf22.f130665c = bmrv42;
        bmsf22.f130663a |= 2;
        this.f110243i = (bmsf) bxvd2.mo74062i();
        m94012y();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.im.ImRootChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    public void onCreate(Bundle bundle) {
        byte[] bArr;
        bmsf bmsf;
        bmrv bmrv;
        bmrx bmrx;
        bmfu a;
        boolean z;
        int i;
        int length;
        if (mo51890q()) {
            mo51862a(bundle, awij.f94454b, 2, bpis.FLOW_TYPE_INSTRUMENT_MANAGER);
            super.onCreate(bundle);
            return;
        }
        Intent intent = getIntent();
        int[] intArrayExtra = intent.getIntArrayExtra("com.google.android.gms.themeResIds");
        this.f110245k = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT".equals(intent.getAction());
        this.f110246l = "com.google.android.gms.wallet.firstparty.ACTION_DELETE_INSTRUMENT".equals(intent.getAction());
        boolean z2 = false;
        if (intArrayExtra != null && (length = intArrayExtra.length) > 0) {
            setTheme(intArrayExtra[0]);
            for (int i2 = 1; i2 < length; i2++) {
                getTheme().applyStyle(intArrayExtra[i2], true);
            }
        } else if (this.f110245k) {
            int i3 = Build.VERSION.SDK_INT;
            if (chhd.f188613a.mo6606a().mo85232a()) {
                awia.m79981a((Activity) this, mo51881h(), awia.f94384f, false);
            } else {
                if (!awia.m79990a(this, mo51881h())) {
                    i = C0126R.style.Theme_Wallet_Material_Light_Alert_Dialog_Without_Action_Bar;
                } else {
                    i = C0126R.style.Theme_Wallet_Material_Dark_Alert_Dialog_Without_Action_Bar;
                }
                setTheme(i);
            }
            this.f110251q = m94010a(mo51881h());
        } else {
            awia.m79981a((Activity) this, mo51881h(), awia.f94383e, true);
        }
        byte[] bArr2 = new byte[0];
        if (C1710chip.m148790b()) {
            m94011x();
            bmsf bmsf2 = this.f110243i;
            if (bmsf2 != null) {
                bmrv bmrv2 = bmsf2.f130665c;
                if (bmrv2 == null) {
                    bmrv2 = bmrv.f130586g;
                }
                bmaq bmaq = bmrv2.f130590c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                bArr = bmaq.f128484d.mo73780k();
                mo51863a(bundle, awij.f94454b, 2, bpis.FLOW_TYPE_INSTRUMENT_MANAGER, bArr);
                super.onCreate(bundle);
                awcf.m79641a((dnx) this);
                if (!C1710chip.m148790b()) {
                    m94011x();
                }
                this.f110244j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
                if (bundle == null && (bmsf = this.f110243i) != null) {
                    bmrv = bmsf.f130665c;
                    if (bmrv == null) {
                        bmrv = bmrv.f130586g;
                    }
                    bmrx = bmrv.f130592e;
                    if (bmrx == null) {
                        bmrx = bmrx.f130597t;
                    }
                    a = m94009a(bmrx);
                    if (a != null) {
                        if ((a.f129169a & 1) != 0) {
                            bmhy bmhy = a.f129170b;
                            if (bmhy == null) {
                                bmhy = bmhy.f129503u;
                            }
                            if (new bxvv(bmhy.f129518n, bmhy.f129500o).contains(bmld.UI_LAUNCH_WITH_CAMERA)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if ((a.f129169a & 32) != 0) {
                            bmhi bmhi = a.f129175g;
                            if (bmhi == null) {
                                bmhi = bmhi.f129409r;
                            }
                            if (new bxvv(bmhi.f129418h, bmhi.f129407i).contains(bmld.UI_LAUNCH_WITH_CAMERA)) {
                                z2 = true;
                            }
                        }
                        if (z || z2) {
                            akoz a2 = awfx.m79876a(this);
                            a2.mo39625a(mo51878cn().name);
                            if (chid.f188646a.mo6606a().mo85255a()) {
                                bmld bmld = bmld.UI_LAUNCH_WITH_CAMERA;
                                bmrv bmrv3 = this.f110243i.f130665c;
                                if (bmrv3 == null) {
                                    bmrv3 = bmrv.f130586g;
                                }
                                bmrx bmrx2 = bmrv3.f130592e;
                                if (bmrx2 == null) {
                                    bmrx2 = bmrx.f130597t;
                                }
                                List e = bngx.m109376e();
                                bmfu a3 = m94009a(bmrx2);
                                if (a3 != null) {
                                    int i4 = a3.f129169a;
                                    if ((i4 & 1) != 0) {
                                        bmhy bmhy2 = a3.f129170b;
                                        if (bmhy2 == null) {
                                            bmhy2 = bmhy.f129503u;
                                        }
                                        e = bmhy2.f129521t;
                                    } else if ((i4 & 32) != 0) {
                                        bmhi bmhi2 = a3.f129175g;
                                        if (bmhi2 == null) {
                                            bmhi2 = bmhi.f129409r;
                                        }
                                        e = bmhi2.f129425q;
                                    }
                                }
                                bjvn.m104715a(a2, bmld, e);
                            }
                            Intent a4 = a2.mo39623a();
                            this.f110250p = a4;
                            if (a4 != null) {
                                startActivityForResult(a4, 5001);
                                return;
                            }
                        }
                    }
                }
                m94012y();
            }
        }
        bArr = bArr2;
        mo51863a(bundle, awij.f94454b, 2, bpis.FLOW_TYPE_INSTRUMENT_MANAGER, bArr);
        super.onCreate(bundle);
        awcf.m79641a((dnx) this);
        if (!C1710chip.m148790b()) {
        }
        this.f110244j = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        bmrv = bmsf.f130665c;
        if (bmrv == null) {
        }
        bmrx = bmrv.f130592e;
        if (bmrx == null) {
        }
        a = m94009a(bmrx);
        if (a != null) {
        }
        m94012y();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        if (mo51879e() != null) {
            ((awmv) mo51879e()).mo52058b(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        TextView textView = this.f110249o;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo51890q() {
        m94011x();
        bmsf bmsf = this.f110243i;
        return bmsf != null && bmsf.f130667e.mo73744a() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Intent mo51891r() {
        byte[] k = this.f110243i.f130667e.mo73780k();
        Intent a = awef.m79686a(this, 0, mo51881h(), getIntent().getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0));
        a.putExtra("o2ActionToken", k);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo52134t() {
        return !this.f110245k ? C0126R.C0128layout.wallet_activity_instrument_manager : C0126R.C0128layout.wallet_activity_instrument_manager_dialog;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo59944u() {
        int i;
        Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.instrument_manager_toolbar);
        mo8626a(toolbar);
        if (!this.f110245k) {
            mo8628aW().mo15853b(true);
            BuyFlowConfig h = mo51881h();
            if (h != null && awia.m80000b(h.f110418b.f110411f)) {
                Drawable i2 = toolbar.mo1699i();
                if (!awia.m79990a(this, mo51881h())) {
                    i = C0126R.color.wallet_uic_visdre_icon_default_light;
                } else {
                    i = C0126R.color.wallet_uic_visdre_icon_default_dark;
                }
                C1173lt.m19599a(i2, C1133kh.m17843b(this, i));
                return;
            }
            return;
        }
        if (this.f110251q) {
            toolbar.mo1716r();
            toolbar.f1349o.mo403b(0, 0);
            this.f110249o = bkfr.m105624j(this);
        } else {
            this.f110249o = (TextView) getLayoutInflater().inflate((int) C0126R.C0128layout.wallet_view_dialog_custom_title, (ViewGroup) null, false);
        }
        mo8628aW().mo15843a(this.f110249o);
        mo8628aW().mo15860d(16);
        this.f110249o.setText(getTitle());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo59945v() {
        this.f94166e = (ProgressSpinnerView) findViewById(C0126R.C0129id.progress_spinner_container);
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
    /* access modifiers changed from: protected */
    /* renamed from: w */
    public awmv mo59946w() {
        boolean z;
        boolean z2 = true;
        if (this.f110243i != null) {
            BuyFlowConfig h = mo51881h();
            String str = this.f94163b;
            bmsf bmsf = this.f110243i;
            boolean z3 = this.f110245k;
            boolean z4 = this.f110246l;
            LogContext logContext = this.f94164c;
            boolean z5 = this.f110247m;
            boolean z6 = this.f110248n;
            if (bmsf != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "ActionToken must not be null.");
            bmrv bmrv = bmsf.f130665c;
            if (bmrv == null) {
                bmrv = bmrv.f130586g;
            }
            if ((bmrv.f130588a & 2) == 0) {
                z2 = false;
            }
            sdo.m34971a(z2, (Object) "ActionToken must have a ResponseContext.");
            awmv awmv = new awmv();
            Bundle a = awzk.m81653a(h, str, logContext);
            bjvp.m104736a(a, "actionToken", bmsf);
            a.putBoolean("isDialog", z3);
            a.putBoolean("showCancelButton", z4);
            a.putBoolean("showTitleInHeader", z5);
            a.putBoolean("showHeaderSeparator", z6);
            awmv.setArguments(a);
            return awmv;
        }
        BuyFlowConfig h2 = mo51881h();
        String str2 = this.f94163b;
        byte[] bArr = this.f110244j;
        boolean z7 = this.f110245k;
        boolean z8 = this.f110246l;
        LogContext logContext2 = this.f94164c;
        if (bArr == null) {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "InstrumentManager parameters must not be null.");
        awmv awmv2 = new awmv();
        Bundle a2 = awzk.m81653a(h2, str2, logContext2);
        a2.putByteArray("instrumentManagerParams", bArr);
        a2.putBoolean("isDialog", z7);
        a2.putBoolean("showCancelButton", z8);
        awmv2.setArguments(a2);
        return awmv2;
    }

    /* renamed from: a */
    public static Intent m94008a(Context context, Intent intent, BuyFlowConfig buyFlowConfig, String str) {
        Intent a = m94007a(context, intent);
        a.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        a.setAction(str);
        return a;
    }

    /* renamed from: a */
    private static bmfu m94009a(bmrx bmrx) {
        bmeq bmeq;
        bmeq bmeq2;
        int i = bmrx.f130600b;
        if (i == 2) {
            return (bmfu) bmrx.f130601c;
        }
        if (i == 1) {
            bmeq = (bmeq) bmrx.f130601c;
        } else {
            bmeq = bmeq.f128990h;
        }
        if ((bmeq.f128992a & 8) == 0) {
            return null;
        }
        if (bmrx.f130600b == 1) {
            bmeq2 = (bmeq) bmrx.f130601c;
        } else {
            bmeq2 = bmeq.f128990h;
        }
        bmfu bmfu = bmeq2.f128996e;
        return bmfu == null ? bmfu.f129167j : bmfu;
    }

    /* renamed from: a */
    public static boolean m94010a(BuyFlowConfig buyFlowConfig) {
        return buyFlowConfig != null && awia.m79992a(buyFlowConfig.f110418b.f110411f) && chhg.f188616a.mo85233b().mo85234a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51864a(Parcelable parcelable, boolean z) {
        InstrumentManagerResult instrumentManagerResult = (InstrumentManagerResult) parcelable;
        Intent d = awce.m79602d(z);
        if (instrumentManagerResult != null) {
            String str = instrumentManagerResult.f110254b;
            if (!TextUtils.isEmpty(str)) {
                d.putExtra("com.google.android.gms.wallet.instrumentId", str);
            }
            long j = instrumentManagerResult.f110255c;
            if (j > 0) {
                d.putExtra("com.google.android.gms.wallet.f1InstrumentId", j);
            }
            byte[] bArr = instrumentManagerResult.f110256d;
            if (bArr != null && bArr.length > 0) {
                d.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            }
        }
        bkdx bkdx = ((awmv) mo51879e()).f94644h;
        String str2 = null;
        if (bkdx instanceof axbb) {
            str2 = ((axbb) bkdx).mo52972t();
        } else if (bkdx instanceof axbf) {
            axba axba = ((axbf) bkdx).f95676a;
            if (axba != null && axba.mo52970t()) {
                str2 = axba.f95604c.getText().toString();
            }
        } else if (bkdx instanceof axae) {
            bkdx bkdx2 = ((axae) bkdx).f95497f;
            if (bkdx2 instanceof axbb) {
                str2 = ((axbb) bkdx2).mo52972t();
            }
        }
        if (str2 != null) {
            d.putExtra("com.google.android.gms.wallet.cvc", str2);
        }
        bkdx bkdx3 = ((awmv) mo51879e()).f94644h;
        int i = 0;
        if (bkdx3 instanceof axbb) {
            i = ((axbb) bkdx3).mo52971m();
        } else if (bkdx3 instanceof axae) {
            bkdx bkdx4 = ((axae) bkdx3).f95497f;
            if (bkdx4 instanceof axbb) {
                i = ((axbb) bkdx4).mo52971m();
            }
        }
        if (i != 0) {
            d.putExtra("com.google.android.gms.wallet.cardColor", i);
        }
        mo51859a(-1, d);
    }
}
