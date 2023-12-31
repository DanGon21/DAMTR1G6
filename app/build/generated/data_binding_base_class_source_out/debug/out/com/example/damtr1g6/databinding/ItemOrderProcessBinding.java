// Generated by view binder compiler. Do not edit!
package com.example.damtr1g6.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.damtr1g6.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemOrderProcessBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView ComandaText;

  @NonNull
  public final TextView EstadoText;

  @NonNull
  public final Button btnRecollir;

  @NonNull
  public final TextView textViewEstadoLastOrder;

  @NonNull
  public final TextView textViewIdLastOrder;

  private ItemOrderProcessBinding(@NonNull LinearLayout rootView, @NonNull TextView ComandaText,
      @NonNull TextView EstadoText, @NonNull Button btnRecollir,
      @NonNull TextView textViewEstadoLastOrder, @NonNull TextView textViewIdLastOrder) {
    this.rootView = rootView;
    this.ComandaText = ComandaText;
    this.EstadoText = EstadoText;
    this.btnRecollir = btnRecollir;
    this.textViewEstadoLastOrder = textViewEstadoLastOrder;
    this.textViewIdLastOrder = textViewIdLastOrder;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemOrderProcessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemOrderProcessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_order_process, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemOrderProcessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ComandaText;
      TextView ComandaText = ViewBindings.findChildViewById(rootView, id);
      if (ComandaText == null) {
        break missingId;
      }

      id = R.id.EstadoText;
      TextView EstadoText = ViewBindings.findChildViewById(rootView, id);
      if (EstadoText == null) {
        break missingId;
      }

      id = R.id.btnRecollir;
      Button btnRecollir = ViewBindings.findChildViewById(rootView, id);
      if (btnRecollir == null) {
        break missingId;
      }

      id = R.id.textViewEstadoLastOrder;
      TextView textViewEstadoLastOrder = ViewBindings.findChildViewById(rootView, id);
      if (textViewEstadoLastOrder == null) {
        break missingId;
      }

      id = R.id.textViewIdLastOrder;
      TextView textViewIdLastOrder = ViewBindings.findChildViewById(rootView, id);
      if (textViewIdLastOrder == null) {
        break missingId;
      }

      return new ItemOrderProcessBinding((LinearLayout) rootView, ComandaText, EstadoText,
          btnRecollir, textViewEstadoLastOrder, textViewIdLastOrder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
