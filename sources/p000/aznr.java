package p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: aznr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznr extends aznc {

    /* renamed from: j */
    public final int f99752j = this.f99694a.getResources().getDimensionPixelSize(C0126R.dimen.image_message_dimen);

    public aznr(Activity activity, azcb azcb, azmy azmy, aznz aznz, azmz azmz, LruCache lruCache, aznd aznd, azni azni, aznf aznf, azng azng) {
        super(activity, azcb, azmy, aznz, azmz, lruCache, aznd, azni, aznf, azng);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo55095a(ViewGroup viewGroup, Cursor cursor) {
        View inflate = LayoutInflater.from(this.f99695b).inflate((int) C0126R.C0128layout.ms_image_message_item, viewGroup, false);
        aznn aznn = new aznn();
        aznn.f99731a = (ImageView) inflate.findViewById(C0126R.C0129id.message_image_view);
        aznn.f99736f = inflate.findViewById(C0126R.C0129id.download_container);
        C1280ps.m19912d(aznn.f99736f, 0);
        aznn.f99733c = (TextView) inflate.findViewById(C0126R.C0129id.download_image_size_text);
        aznn.f99732b = (ProgressBar) inflate.findViewById(C0126R.C0129id.downloading_progress);
        aznn.f99734d = (TextView) inflate.findViewById(C0126R.C0129id.downloading_image_text);
        aznn.f99735e = (TextView) inflate.findViewById(C0126R.C0129id.image_error_text);
        aznn.f99737g = -1;
        aznn.f99738h = -1;
        inflate.setTag(aznn);
        return inflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cc, code lost:
        if (r0.length == 0) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cf, code lost:
        r11.f99736f.setVisibility(8);
        r11.f99738h = r11.f99737g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01da, code lost:
        r0 = r2.getString(1);
        r11.f99738h = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e4, code lost:
        if (r8.f99790a <= 0) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e6, code lost:
        r11.f99734d.setVisibility(0);
        r11.f99733c.setVisibility(0);
        r11.f99733c.setText(java.lang.String.format("(%s)", p000.azpi.m86082c(r8.f99790a)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0206, code lost:
        r11.f99733c.setVisibility(8);
        r11.f99734d.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0210, code lost:
        r11.f99731a.setOnClickListener(new p000.aznl(r1, r11, r8, r0));
        r6 = r1.f99694a;
        r10 = r8.f99791b;
        r3 = r11.f99739i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0220, code lost:
        if (r3 == null) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0222, code lost:
        r4 = r3.f99743a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0226, code lost:
        if (r4 != r11.f99737g) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0228, code lost:
        r0 = new java.lang.Object[]{java.lang.Integer.valueOf(r4), r3.f99746d};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0236, code lost:
        new java.lang.Object[1][0] = java.lang.Integer.valueOf(r4);
        r3.interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0241, code lost:
        new java.lang.Object[1][0] = java.lang.Integer.valueOf(r11.f99737g);
        r4 = r11.f99737g;
        r9 = r1.f99752j;
        r11.f99739i = new p000.aznq(r4, r11, r6, r0, r9, r9, r10);
        r11.f99739i.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (p000.azoy.m85989e(r7.f177274c) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        if (r14 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0158, code lost:
        if (r14 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015a, code lost:
        r14.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015d, code lost:
        r0 = r11.f99731a;
        r4 = r10.getWidth();
        r6 = r10.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016b, code lost:
        if (r4 >= r6) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016d, code lost:
        r12 = (float) p000.azpi.m86074b(220);
        r4 = java.lang.Math.max((((float) r4) / ((float) r6)) * r12, (float) p000.azpi.m86074b(40));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0181, code lost:
        r12 = (float) p000.azpi.m86074b(220);
        r12 = java.lang.Math.max((((float) r6) / ((float) r4)) * r12, (float) p000.azpi.m86074b(40));
        r4 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019a, code lost:
        r0.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) r4, (int) r12));
        r11.f99731a.setImageDrawable(p000.azog.m85914a(r1.f99694a, r10));
        r11.f99734d.setVisibility(8);
        r11.f99735e.setVisibility(8);
        r11.f99736f.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c4, code lost:
        if (android.text.TextUtils.isEmpty(r8.f99794e) == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c6, code lost:
        r0 = r8.f99792c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c8, code lost:
        if (r0 != null) goto L_0x01cb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0155  */
    /* renamed from: b */
    public final void mo55090b(View view, Cursor cursor) {
        azom azom;
        Allocation allocation;
        Allocation allocation2;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation3;
        cbin cbin;
        bxtx bxtx;
        String str;
        bxtx bxtx2;
        cbin cbin2;
        Cursor cursor2 = cursor;
        aznn aznn = (aznn) view.getTag();
        aznn.f99737g = cursor.getPosition();
        if (!azoy.m85996l(cursor2.getString(8))) {
            aznn.f99731a.setVisibility(8);
            return;
        }
        cbil cbil = (cbil) mo55088a(cbil.class, (bxxk) cbil.f177257h.mo74142c(7), cursor2.getBlob(7), cursor.getPosition());
        RenderScript renderScript = null;
        r6 = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur2 = null;
        renderScript = null;
        if (cbil != null && cbil.f177259a == 2) {
            if (!azoy.m85987c(((cbin) cbil.f177260b).f177274c)) {
                if (cbil.f177259a == 2) {
                    cbin2 = (cbin) cbil.f177260b;
                } else {
                    cbin2 = cbin.f177270f;
                }
            }
            if (cbil.f177259a == 2) {
                cbin = (cbin) cbil.f177260b;
            } else {
                cbin = cbin.f177270f;
            }
            cbio cbio = cbin.f177275d;
            if (cbio != null) {
                int i = cbio.f177280b;
                String str2 = cbin.f177274c;
                if (cbin.f177272a == 5) {
                    bxtx = (bxtx) cbin.f177273b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                byte[] k = bxtx.mo73780k();
                if (cbin.f177272a == 2) {
                    str = (String) cbin.f177273b;
                } else {
                    str = "";
                }
                cbio cbio2 = cbin.f177275d;
                if (cbio2 == null) {
                    cbio2 = cbio.f177277c;
                }
                cbhy cbhy = cbio2.f177279a;
                if (cbhy == null) {
                    cbhy = cbhy.f177214d;
                }
                if (cbhy.f177216a == 1) {
                    bxtx2 = (bxtx) cbhy.f177217b;
                } else {
                    bxtx2 = bxtx.f164797b;
                }
                azom = new azom(i, str2, k, str, bxtx2.mo73780k());
            } else {
                azom = null;
            }
            if (azom == null) {
                aznn.f99731a.setVisibility(0);
                int i2 = aznn.f99738h;
                int i3 = aznn.f99737g;
                if (i2 != i3) {
                    aznn.f99738h = -1;
                    byte[] bArr = azom.f99793d;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    Context context = this.f99694a;
                    try {
                        int i4 = Build.VERSION.SDK_INT;
                        RenderScript create = RenderScript.create(context);
                        try {
                            allocation2 = Allocation.createFromBitmap(create, decodeByteArray, Allocation.MipmapControl.MIPMAP_NONE, 1);
                        } catch (Exception e) {
                            e = e;
                            allocation2 = null;
                            allocation3 = null;
                            renderScript = create;
                            scriptIntrinsicBlur = allocation;
                            try {
                                azoj.m85931a("ImageUtil", e, "Failed to blur thumbnail.", new Object[0]);
                                if (renderScript != null) {
                                    renderScript.destroy();
                                }
                                if (allocation2 != null) {
                                    allocation2.destroy();
                                }
                                if (scriptIntrinsicBlur != null) {
                                    scriptIntrinsicBlur.destroy();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (renderScript != null) {
                                    renderScript.destroy();
                                }
                                if (allocation2 != null) {
                                    allocation2.destroy();
                                }
                                if (scriptIntrinsicBlur != null) {
                                    scriptIntrinsicBlur.destroy();
                                }
                                if (allocation != null) {
                                    allocation.destroy();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            allocation2 = null;
                            allocation = null;
                            renderScript = create;
                            scriptIntrinsicBlur = allocation;
                            if (renderScript != null) {
                            }
                            if (allocation2 != null) {
                            }
                            if (scriptIntrinsicBlur != null) {
                            }
                            if (allocation != null) {
                            }
                            throw th;
                        }
                        try {
                            allocation = Allocation.createTyped(create, allocation2.getType());
                        } catch (Exception e2) {
                            e = e2;
                            allocation3 = null;
                            renderScript = create;
                            scriptIntrinsicBlur = allocation;
                            azoj.m85931a("ImageUtil", e, "Failed to blur thumbnail.", new Object[0]);
                            if (renderScript != null) {
                            }
                            if (allocation2 != null) {
                            }
                            if (scriptIntrinsicBlur != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            allocation = null;
                            renderScript = create;
                            scriptIntrinsicBlur = allocation;
                            if (renderScript != null) {
                            }
                            if (allocation2 != null) {
                            }
                            if (scriptIntrinsicBlur != null) {
                            }
                            if (allocation != null) {
                            }
                            throw th;
                        }
                        try {
                            scriptIntrinsicBlur2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                            scriptIntrinsicBlur2.setRadius(10.0f);
                            scriptIntrinsicBlur2.setInput(allocation2);
                            scriptIntrinsicBlur2.forEach(allocation);
                            allocation.copyTo(decodeByteArray);
                            if (create != null) {
                                create.destroy();
                            }
                            if (allocation2 != null) {
                                allocation2.destroy();
                            }
                            if (scriptIntrinsicBlur2 != null) {
                                scriptIntrinsicBlur2.destroy();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            scriptIntrinsicBlur = scriptIntrinsicBlur2;
                            renderScript = create;
                            azoj.m85931a("ImageUtil", e, "Failed to blur thumbnail.", new Object[0]);
                            if (renderScript != null) {
                            }
                            if (allocation2 != null) {
                            }
                            if (scriptIntrinsicBlur != null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            scriptIntrinsicBlur = scriptIntrinsicBlur2;
                            renderScript = create;
                            if (renderScript != null) {
                            }
                            if (allocation2 != null) {
                            }
                            if (scriptIntrinsicBlur != null) {
                            }
                            if (allocation != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        scriptIntrinsicBlur = null;
                        allocation2 = null;
                        allocation = null;
                        azoj.m85931a("ImageUtil", e, "Failed to blur thumbnail.", new Object[0]);
                        if (renderScript != null) {
                        }
                        if (allocation2 != null) {
                        }
                        if (scriptIntrinsicBlur != null) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        scriptIntrinsicBlur = null;
                        allocation2 = null;
                        allocation = null;
                        if (renderScript != null) {
                        }
                        if (allocation2 != null) {
                        }
                        if (scriptIntrinsicBlur != null) {
                        }
                        if (allocation != null) {
                        }
                        throw th;
                    }
                } else {
                    new Object[1][0] = Integer.valueOf(i3);
                }
            } else {
                aznn.f99731a.setVisibility(8);
            }
            mo55092d(view, cursor);
            mo55091c(view, cursor);
        }
        azom = null;
        if (azom == null) {
        }
        mo55092d(view, cursor);
        mo55091c(view, cursor);
    }
}
