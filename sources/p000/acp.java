package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: acp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acp {

    /* renamed from: a */
    private static final PorterDuff.Mode f224a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static acp f225b;

    /* renamed from: g */
    private static final C1231nx f226g = new C1231nx(6);

    /* renamed from: c */
    private WeakHashMap f227c;

    /* renamed from: d */
    private final WeakHashMap f228d = new WeakHashMap(0);

    /* renamed from: e */
    private TypedValue f229e;

    /* renamed from: f */
    private boolean f230f;

    /* renamed from: h */
    private C1496xs f231h;

    /* renamed from: a */
    public static synchronized acp m472a() {
        acp acp;
        synchronized (acp.class) {
            if (f225b == null) {
                f225b = new acp();
                int i = Build.VERSION.SDK_INT;
            }
            acp = f225b;
        }
        return acp;
    }

    /* renamed from: a */
    public final synchronized void mo356a(C1496xs xsVar) {
        this.f231h = xsVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018f, code lost:
        return r0;
     */
    /* renamed from: b */
    public final synchronized ColorStateList mo357b(Context context, int i) {
        ColorStateList colorStateList;
        C1246ol olVar;
        WeakHashMap weakHashMap = this.f227c;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (olVar = (C1246ol) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList) olVar.mo15646f(i);
        }
        if (colorStateList == null) {
            C1496xs xsVar = this.f231h;
            if (xsVar != null) {
                if (i == C0126R.C0127drawable.abc_edit_text_material) {
                    colorStateList2 = C1391tv.m20458a(context, C0126R.color.abc_tint_edittext);
                } else if (i == C0126R.C0127drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList2 = C1391tv.m20458a(context, C0126R.color.abc_tint_switch_track);
                } else if (i == C0126R.C0127drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList b = adm.m516b(context, C0126R.attr.colorSwitchThumbNormal);
                    if (b != null) {
                        if (b.isStateful()) {
                            int[] iArr3 = adm.f278a;
                            iArr[0] = iArr3;
                            iArr2[0] = b.getColorForState(iArr3, 0);
                            iArr[1] = adm.f281d;
                            iArr2[1] = adm.m514a(context, (int) C0126R.attr.colorControlActivated);
                            iArr[2] = adm.f282e;
                            iArr2[2] = b.getDefaultColor();
                            colorStateList2 = new ColorStateList(iArr, iArr2);
                        }
                    }
                    iArr[0] = adm.f278a;
                    iArr2[0] = adm.m517c(context, C0126R.attr.colorSwitchThumbNormal);
                    iArr[1] = adm.f281d;
                    iArr2[1] = adm.m514a(context, (int) C0126R.attr.colorControlActivated);
                    iArr[2] = adm.f282e;
                    iArr2[2] = adm.m514a(context, (int) C0126R.attr.colorSwitchThumbNormal);
                    colorStateList2 = new ColorStateList(iArr, iArr2);
                } else if (i == C0126R.C0127drawable.abc_btn_default_mtrl_shape) {
                    colorStateList2 = C1496xs.m20818a(context, adm.m514a(context, (int) C0126R.attr.colorButtonNormal));
                } else if (i == C0126R.C0127drawable.abc_btn_borderless_material) {
                    colorStateList2 = C1496xs.m20818a(context, 0);
                } else if (i == C0126R.C0127drawable.abc_btn_colored_material) {
                    colorStateList2 = C1496xs.m20818a(context, adm.m514a(context, (int) C0126R.attr.colorAccent));
                } else {
                    if (i != C0126R.C0127drawable.abc_spinner_mtrl_am_alpha) {
                        if (i != C0126R.C0127drawable.abc_spinner_textfield_background_material) {
                            if (C1496xs.m20820a(xsVar.f27611b, i)) {
                                colorStateList2 = adm.m516b(context, C0126R.attr.colorControlNormal);
                            } else if (C1496xs.m20820a(xsVar.f27614e, i)) {
                                colorStateList2 = C1391tv.m20458a(context, C0126R.color.abc_tint_default);
                            } else if (C1496xs.m20820a(xsVar.f27615f, i)) {
                                colorStateList2 = C1391tv.m20458a(context, C0126R.color.abc_tint_btn_checkable);
                            } else if (i == C0126R.C0127drawable.abc_seekbar_thumb_material) {
                                colorStateList2 = C1391tv.m20458a(context, C0126R.color.abc_tint_seek_thumb);
                            }
                        }
                    }
                    colorStateList2 = C1391tv.m20458a(context, C0126R.color.abc_tint_spinner);
                }
            }
            if (colorStateList2 != null) {
                if (this.f227c == null) {
                    this.f227c = new WeakHashMap();
                }
                C1246ol olVar2 = (C1246ol) this.f227c.get(context);
                if (olVar2 == null) {
                    olVar2 = new C1246ol();
                    this.f227c.put(context, olVar2);
                }
                int i2 = olVar2.f26814d;
                if (i2 != 0) {
                    if (i <= olVar2.f26812b[i2 - 1]) {
                        olVar2.mo15637a(i, colorStateList2);
                    }
                }
                if (olVar2.f26811a) {
                    if (i2 >= olVar2.f26812b.length) {
                        olVar2.mo15639b();
                    }
                }
                int i3 = olVar2.f26814d;
                if (i3 >= olVar2.f26812b.length) {
                    int a = C1229nv.m19713a(i3 + 1);
                    int[] iArr4 = new int[a];
                    Object[] objArr = new Object[a];
                    int[] iArr5 = olVar2.f26812b;
                    System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                    Object[] objArr2 = olVar2.f26813c;
                    System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                    olVar2.f26812b = iArr4;
                    olVar2.f26813c = objArr;
                }
                olVar2.f26812b[i3] = i;
                olVar2.f26813c[i3] = colorStateList2;
                olVar2.f26814d = i3 + 1;
            } else {
                colorStateList = colorStateList2;
            }
        }
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m473a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (acp.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) f226g.mo15546a(Integer.valueOf(C1231nx.m19731a(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) f226g.mo15547a(Integer.valueOf(C1231nx.m19731a(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return null;
     */
    /* renamed from: a */
    private final synchronized Drawable m474a(Context context, long j) {
        WeakReference weakReference;
        C1230nw nwVar = (C1230nw) this.f228d.get(context);
        if (!(nwVar == null || (weakReference = (WeakReference) nwVar.mo15534a(j)) == null)) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            nwVar.mo15539b(j);
        }
    }

    /* renamed from: a */
    private final synchronized void m475a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1230nw nwVar = (C1230nw) this.f228d.get(context);
            if (nwVar == null) {
                nwVar = new C1230nw();
                this.f228d.put(context, nwVar);
            }
            nwVar.mo15540b(j, new WeakReference(constantState));
        }
    }

    /* renamed from: a */
    static void m476a(Drawable drawable, adp adp, int[] iArr) {
        ColorStateList colorStateList;
        if (!C1540zi.m20971b(drawable) || drawable.mutate() == drawable) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (adp.f288d) {
                colorStateList = adp.f285a;
            } else if (!adp.f287c) {
                drawable.clearColorFilter();
                int i = Build.VERSION.SDK_INT;
            } else {
                colorStateList = null;
            }
            PorterDuff.Mode mode = !adp.f287c ? f224a : adp.f286b;
            if (!(colorStateList == null || mode == null)) {
                porterDuffColorFilter = m473a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            int i2 = Build.VERSION.SDK_INT;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acp.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable
     arg types: [android.content.Context, int, int]
     candidates:
      acp.a(android.content.Context, long, android.graphics.drawable.Drawable):void
      acp.a(android.graphics.drawable.Drawable, adp, int[]):void
      acp.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable */
    /* renamed from: a */
    public final synchronized Drawable mo353a(Context context, int i) {
        return mo354a(context, i, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ac  */
    /* renamed from: a */
    public final synchronized Drawable mo354a(Context context, int i, boolean z) {
        Drawable drawable;
        int i2;
        Drawable drawable2;
        boolean z2 = false;
        if (!this.f230f) {
            this.f230f = true;
            Drawable a = mo353a(context, (int) C0126R.C0127drawable.abc_vector_test);
            if (a != null) {
                if (!(a instanceof aux)) {
                    if ("android.graphics.drawable.VectorDrawable".equals(a.getClass().getName())) {
                    }
                }
            }
            this.f230f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        if (this.f229e == null) {
            this.f229e = new TypedValue();
        }
        TypedValue typedValue = this.f229e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable a2 = m474a(context, j);
        PorterDuff.Mode mode = null;
        drawable = null;
        mode = null;
        if (a2 == null) {
            if (this.f231h == null || i != C0126R.C0127drawable.abc_cab_background_top_material) {
                a2 = null;
            } else {
                a2 = new LayerDrawable(new Drawable[]{mo353a(context, (int) C0126R.C0127drawable.abc_cab_background_internal_bg), mo353a(context, (int) C0126R.C0127drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (a2 != null) {
                a2.setChangingConfigurations(typedValue.changingConfigurations);
                m475a(context, j, a2);
            }
        }
        if (a2 == null) {
            a2 = C1133kh.m17836a(context, i);
        }
        if (a2 != null) {
            ColorStateList b = mo357b(context, i);
            if (b == null) {
                C1496xs xsVar = this.f231h;
                if (xsVar != null) {
                    if (i == C0126R.C0127drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) a2;
                        C1496xs.m20819a(layerDrawable.findDrawableByLayerId(16908288), adm.m514a(context, (int) C0126R.attr.colorControlNormal), C1497xt.f27616a);
                        C1496xs.m20819a(layerDrawable.findDrawableByLayerId(16908303), adm.m514a(context, (int) C0126R.attr.colorControlNormal), C1497xt.f27616a);
                        C1496xs.m20819a(layerDrawable.findDrawableByLayerId(16908301), adm.m514a(context, (int) C0126R.attr.colorControlActivated), C1497xt.f27616a);
                    } else {
                        if (i != C0126R.C0127drawable.abc_ratingbar_material) {
                            if (!(i == C0126R.C0127drawable.abc_ratingbar_indicator_material || i == C0126R.C0127drawable.abc_ratingbar_small_material)) {
                            }
                        }
                        LayerDrawable layerDrawable2 = (LayerDrawable) a2;
                        C1496xs.m20819a(layerDrawable2.findDrawableByLayerId(16908288), adm.m517c(context, C0126R.attr.colorControlNormal), C1497xt.f27616a);
                        C1496xs.m20819a(layerDrawable2.findDrawableByLayerId(16908303), adm.m514a(context, (int) C0126R.attr.colorControlActivated), C1497xt.f27616a);
                        C1496xs.m20819a(layerDrawable2.findDrawableByLayerId(16908301), adm.m514a(context, (int) C0126R.attr.colorControlActivated), C1497xt.f27616a);
                    }
                }
                if (xsVar != null) {
                    PorterDuff.Mode mode2 = C1497xt.f27616a;
                    int i3 = 16842801;
                    i3 = 16842801;
                    if (C1496xs.m20820a(xsVar.f27610a, i)) {
                        i2 = -1;
                        z2 = true;
                        i3 = C0126R.attr.colorControlNormal;
                    } else if (C1496xs.m20820a(xsVar.f27612c, i)) {
                        i2 = -1;
                        z2 = true;
                        i3 = C0126R.attr.colorControlActivated;
                    } else if (C1496xs.m20820a(xsVar.f27613d, i)) {
                        mode2 = PorterDuff.Mode.MULTIPLY;
                        i2 = -1;
                        z2 = true;
                    } else if (i == C0126R.C0127drawable.abc_list_divider_mtrl_alpha) {
                        i2 = Math.round(40.8f);
                        z2 = true;
                        i3 = 16842800;
                    } else if (i == C0126R.C0127drawable.abc_dialog_material_background) {
                        i2 = -1;
                        z2 = true;
                    } else {
                        i2 = -1;
                        i3 = 0;
                    }
                    if (z2) {
                        if (C1540zi.m20971b(a2)) {
                            drawable2 = a2.mutate();
                        } else {
                            drawable2 = a2;
                        }
                        drawable2.setColorFilter(C1497xt.m20821a(adm.m514a(context, i3), mode2));
                        if (i2 != -1) {
                            drawable2.setAlpha(i2);
                        }
                    }
                }
                if (!z) {
                }
                if (drawable != null) {
                    C1540zi.m20970a();
                }
            } else {
                if (C1540zi.m20971b(a2)) {
                    a2 = a2.mutate();
                }
                int i4 = Build.VERSION.SDK_INT;
                C1173lt.m19601a(a2, b);
                if (this.f231h != null && i == C0126R.C0127drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    C1173lt.m19604a(a2, mode);
                }
            }
        }
        drawable = a2;
        if (drawable != null) {
        }
        return drawable;
    }

    /* renamed from: a */
    public final synchronized void mo355a(Context context) {
        C1230nw nwVar = (C1230nw) this.f228d.get(context);
        if (nwVar != null) {
            nwVar.mo15542c();
        }
    }
}
